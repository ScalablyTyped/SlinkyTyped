package typingsSlinky.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndefinedLiteral extends Node {
  @JSName("type")
  var type_UndefinedLiteral: typingsSlinky.handlebars.handlebarsStrings.UndefinedLiteral = js.native
}

object UndefinedLiteral {
  @scala.inline
  def apply(loc: SourceLocation, `type`: typingsSlinky.handlebars.handlebarsStrings.UndefinedLiteral): UndefinedLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndefinedLiteral]
  }
  @scala.inline
  implicit class UndefinedLiteralOps[Self <: UndefinedLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.handlebars.handlebarsStrings.UndefinedLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

