package typingsSlinky.konva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnimationFn = js.Function1[
    /* frame */ js.UndefOr[typingsSlinky.konva.typesMod.IFrame], 
    scala.Boolean | scala.Unit
  ]
}
