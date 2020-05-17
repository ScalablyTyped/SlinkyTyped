package typingsSlinky.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object util {
  type CustomizerFunction = js.Function6[
    /* objValue */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    /* stack */ js.Any, 
    typingsSlinky.jointjs.mod.util.NotVoid
  ]
  type IterateeFunction = js.Function1[/* value */ js.Any, typingsSlinky.jointjs.mod.util.NotVoid]
  type IterateeShorthand = typingsSlinky.jointjs.mod.util.PropertyPath
  type SourceObjectsOptionalFinalCustomizer = js.Array[js.Object | typingsSlinky.jointjs.mod.util.CustomizerFunction]
}
