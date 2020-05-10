package typingsSlinky.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentStatement extends Node {
  var strip: StripFlags = js.native
  @JSName("type")
  var type_CommentStatement: typingsSlinky.handlebars.handlebarsStrings.CommentStatement = js.native
  var value: String = js.native
}

object CommentStatement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    strip: StripFlags,
    `type`: typingsSlinky.handlebars.handlebarsStrings.CommentStatement,
    value: String
  ): CommentStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentStatement]
  }
  @scala.inline
  implicit class CommentStatementOps[Self <: CommentStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrip(value: StripFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.handlebars.handlebarsStrings.CommentStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

