package typingsSlinky.angularCompiler.r3FactoryMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ @js.native
trait R3ExpressionFactoryMetadata extends R3ConstructorFactoryMetadata {
  var expression: Expression = js.native
}

object R3ExpressionFactoryMetadata {
  @scala.inline
  def apply(expression: Expression, injectFn: ExternalReference, name: String, `type`: Expression): R3ExpressionFactoryMetadata = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ExpressionFactoryMetadata]
  }
  @scala.inline
  implicit class R3ExpressionFactoryMetadataOps[Self <: R3ExpressionFactoryMetadata] (val x: Self) extends AnyVal {
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
  }
  
}

