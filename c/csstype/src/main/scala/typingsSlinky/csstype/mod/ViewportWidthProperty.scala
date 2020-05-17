package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.ViewportLength[TLength]
  - java.lang.String
*/
trait ViewportWidthProperty[TLength] extends js.Object

object ViewportWidthProperty {
  @scala.inline
  implicit def apply[TLength](value: String): ViewportWidthProperty[TLength] = value.asInstanceOf[ViewportWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: ViewportLength[TLength]): ViewportWidthProperty[TLength] = value.asInstanceOf[ViewportWidthProperty[TLength]]
}

