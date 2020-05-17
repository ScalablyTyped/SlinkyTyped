package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TypeCastExpression_
  extends Expression
     with BaseNode
     with ExpressionWrapper
     with Flow {
  var expression: Expression = js.native
  var typeAnnotation: TypeAnnotation_ = js.native
  @JSName("type")
  var type_TypeCastExpression_ : TypeCastExpression = js.native
}

object TypeCastExpression_ {
  @scala.inline
  def apply(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCastExpression_]
  }
  @scala.inline
  implicit class TypeCastExpression_Ops[Self <: TypeCastExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TypeCastExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: TypeAnnotation_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

