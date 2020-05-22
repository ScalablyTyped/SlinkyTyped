package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factory extends js.Object {
  var factory: typingsSlinky.angularCompiler.outputAstMod.Expression
  var statements: js.Array[Statement]
}

object Factory {
  @scala.inline
  def apply(factory: typingsSlinky.angularCompiler.outputAstMod.Expression, statements: js.Array[Statement]): Factory = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory]
  }
}

