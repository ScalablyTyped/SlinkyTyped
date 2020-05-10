package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeCastExpression_
  extends Node
     with Expression
     with ExpressionWrapper
     with Flow {
  var expression: Expression = js.native
  var typeAnnotation: FlowTypeAnnotation = js.native
  @JSName("type")
  var type_TypeCastExpression_ : TypeCastExpression = js.native
}

object TypeCastExpression_ {
  @scala.inline
  def apply(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: TypeCastExpression,
    typeAnnotation: FlowTypeAnnotation
  ): TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
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
    def withTypeAnnotation(value: FlowTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

