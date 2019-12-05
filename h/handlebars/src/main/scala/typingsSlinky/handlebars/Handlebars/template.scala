package typingsSlinky.handlebars.Handlebars

import typingsSlinky.handlebars.HandlebarsTemplateDelegate
import typingsSlinky.handlebars.TemplateSpecification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Handlebars.template")
@js.native
object template extends js.Object {
  def apply[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
}

