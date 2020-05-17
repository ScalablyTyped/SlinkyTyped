package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.ViewportLength[TLength]
  - java.lang.String
*/
trait ViewportHeightProperty[TLength] extends js.Object

object ViewportHeightProperty {
  @scala.inline
  implicit def apply[TLength](value: String): ViewportHeightProperty[TLength] = value.asInstanceOf[ViewportHeightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: ViewportLength[TLength]): ViewportHeightProperty[TLength] = value.asInstanceOf[ViewportHeightProperty[TLength]]
}

