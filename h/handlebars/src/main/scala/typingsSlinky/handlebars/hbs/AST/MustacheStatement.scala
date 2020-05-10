package typingsSlinky.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MustacheStatement extends Node {
  var escaped: Boolean = js.native
  var hash: Hash = js.native
  var params: js.Array[Expression] = js.native
  var path: PathExpression | Literal = js.native
  var strip: StripFlags = js.native
  @JSName("type")
  var type_MustacheStatement: typingsSlinky.handlebars.handlebarsStrings.MustacheStatement = js.native
}

object MustacheStatement {
  @scala.inline
  def apply(
    escaped: Boolean,
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression | Literal,
    strip: StripFlags,
    `type`: typingsSlinky.handlebars.handlebarsStrings.MustacheStatement
  ): MustacheStatement = {
    val __obj = js.Dynamic.literal(escaped = escaped.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheStatement]
  }
  @scala.inline
  implicit class MustacheStatementOps[Self <: MustacheStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscaped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escaped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: Hash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: PathExpression | Literal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrip(value: StripFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.handlebars.handlebarsStrings.MustacheStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

