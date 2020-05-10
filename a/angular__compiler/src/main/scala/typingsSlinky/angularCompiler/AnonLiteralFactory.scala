package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLiteralFactory extends js.Object {
  var literalFactory: Expression = js.native
  var literalFactoryArguments: js.Array[Expression] = js.native
}

object AnonLiteralFactory {
  @scala.inline
  def apply(literalFactory: Expression, literalFactoryArguments: js.Array[Expression]): AnonLiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLiteralFactory]
  }
  @scala.inline
  implicit class AnonLiteralFactoryOps[Self <: AnonLiteralFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLiteralFactory(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiteralFactoryArguments(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalFactoryArguments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

