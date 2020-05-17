package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.coreMod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepsExpr extends js.Object {
  var depsExpr: typingsSlinky.angularCompiler.outputAstMod.Expression = js.native
  var flags: NodeFlags = js.native
  var providerExpr: typingsSlinky.angularCompiler.outputAstMod.Expression = js.native
  var tokenExpr: typingsSlinky.angularCompiler.outputAstMod.Expression = js.native
}

object DepsExpr {
  @scala.inline
  def apply(
    depsExpr: typingsSlinky.angularCompiler.outputAstMod.Expression,
    flags: NodeFlags,
    providerExpr: typingsSlinky.angularCompiler.outputAstMod.Expression,
    tokenExpr: typingsSlinky.angularCompiler.outputAstMod.Expression
  ): DepsExpr = {
    val __obj = js.Dynamic.literal(depsExpr = depsExpr.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], providerExpr = providerExpr.asInstanceOf[js.Any], tokenExpr = tokenExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepsExpr]
  }
  @scala.inline
  implicit class DepsExprOps[Self <: DepsExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepsExpr(value: typingsSlinky.angularCompiler.outputAstMod.Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: NodeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderExpr(value: typingsSlinky.angularCompiler.outputAstMod.Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenExpr(value: typingsSlinky.angularCompiler.outputAstMod.Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenExpr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

