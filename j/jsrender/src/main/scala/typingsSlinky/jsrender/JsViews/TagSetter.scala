package typingsSlinky.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsrender.JsViews.TagOptions
  - java.lang.String
  - js.Function1[/ * repeated * / js.Any, js.Any]
*/
trait TagSetter extends js.Object

object TagSetter {
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, js.Any]): TagSetter = value.asInstanceOf[TagSetter]
  @scala.inline
  implicit def apply(value: String): TagSetter = value.asInstanceOf[TagSetter]
  @scala.inline
  implicit def apply(value: TagOptions): TagSetter = value.asInstanceOf[TagSetter]
}

