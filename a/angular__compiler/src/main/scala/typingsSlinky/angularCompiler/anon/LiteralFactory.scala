package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralFactory extends js.Object {
  var literalFactory: typingsSlinky.angularCompiler.outputAstMod.Expression = js.native
  var literalFactoryArguments: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression] = js.native
}

object LiteralFactory {
  @scala.inline
  def apply(
    literalFactory: typingsSlinky.angularCompiler.outputAstMod.Expression,
    literalFactoryArguments: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression]
  ): LiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralFactory]
  }
  @scala.inline
  implicit class LiteralFactoryOps[Self <: LiteralFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLiteralFactory(value: typingsSlinky.angularCompiler.outputAstMod.Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiteralFactoryArguments(value: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalFactoryArguments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

