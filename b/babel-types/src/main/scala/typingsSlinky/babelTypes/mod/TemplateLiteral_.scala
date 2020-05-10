package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLiteral_
  extends Node
     with Expression
     with Literal {
  var expressions: js.Array[Expression] = js.native
  var quasis: js.Array[TemplateElement_] = js.native
  @JSName("type")
  var type_TemplateLiteral_ : TemplateLiteral = js.native
}

object TemplateLiteral_ {
  @scala.inline
  def apply(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement_],
    start: Double,
    `type`: TemplateLiteral
  ): TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteral_]
  }
  @scala.inline
  implicit class TemplateLiteral_Ops[Self <: TemplateLiteral_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressions(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuasis(value: js.Array[TemplateElement_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TemplateLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

