package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory extends js.Object {
  var factory: typingsSlinky.angularCompiler.outputAstMod.Expression = js.native
  var statements: js.Array[Statement] = js.native
}

object Factory {
  @scala.inline
  def apply(factory: typingsSlinky.angularCompiler.outputAstMod.Expression, statements: js.Array[Statement]): Factory = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory]
  }
  @scala.inline
  implicit class FactoryOps[Self <: Factory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactory(value: typingsSlinky.angularCompiler.outputAstMod.Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatements(value: js.Array[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

