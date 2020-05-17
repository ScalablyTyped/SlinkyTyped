package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression] = js.native
  var stmts: js.Array[Statement] = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression], stmts: js.Array[Statement]): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStmts(value: js.Array[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stmts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

