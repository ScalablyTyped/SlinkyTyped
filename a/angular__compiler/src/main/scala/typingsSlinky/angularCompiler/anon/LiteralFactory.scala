package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralFactory extends js.Object {
  var literalFactory: typingsSlinky.angularCompiler.outputAstMod.Expression
  var literalFactoryArguments: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression]
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
}

