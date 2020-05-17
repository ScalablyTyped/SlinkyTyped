package typingsSlinky.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.handlebars.Handlebars.TemplateDelegate[T]
  - java.lang.String
*/
trait Template[T] extends js.Object

object Template {
  @scala.inline
  implicit def apply[T](value: String): Template[T] = value.asInstanceOf[Template[T]]
  @scala.inline
  implicit def apply[T](value: TemplateDelegate[T]): Template[T] = value.asInstanceOf[Template[T]]
}

