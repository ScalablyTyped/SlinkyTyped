package typingsSlinky.reactDndMultiBackend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CheckFunction[E /* <: org.scalajs.dom.raw.UIEvent */] = js.Function1[/* event */ E, scala.Boolean]
  type PreviewGenerator[T] = js.Function1[
    /* arg */ typingsSlinky.reactDndMultiBackend.mod.PreviewGeneratorArg[T], 
    slinky.core.TagMod[scala.Any]
  ]
}
