package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait TemplateLiteral_
  extends Expression
     with BaseNode
     with Literal {
  var expressions: js.Array[Expression] = js.native
  var quasis: js.Array[TemplateElement_] = js.native
  @JSName("type")
  var type_TemplateLiteral_ : TemplateLiteral = js.native
}

object TemplateLiteral_ {
  @scala.inline
  def apply(expressions: js.Array[Expression], quasis: js.Array[TemplateElement_], `type`: TemplateLiteral): TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
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

