package typingsSlinky.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression * / any */ @js.native
trait TypeCastExpression extends js.Object {
  var expression: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any = js.native
  var typeAnnotation: TypeAnnotation = js.native
}

object TypeCastExpression {
  @scala.inline
  def apply(
    expression: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any,
    typeAnnotation: TypeAnnotation
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCastExpression]
  }
  @scala.inline
  implicit class TypeCastExpressionOps[Self <: TypeCastExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: TypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

