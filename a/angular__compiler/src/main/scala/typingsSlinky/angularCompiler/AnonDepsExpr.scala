package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.coreMod.NodeFlags
import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDepsExpr extends js.Object {
  var depsExpr: Expression = js.native
  var flags: NodeFlags = js.native
  var providerExpr: Expression = js.native
  var tokenExpr: Expression = js.native
}

object AnonDepsExpr {
  @scala.inline
  def apply(depsExpr: Expression, flags: NodeFlags, providerExpr: Expression, tokenExpr: Expression): AnonDepsExpr = {
    val __obj = js.Dynamic.literal(depsExpr = depsExpr.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], providerExpr = providerExpr.asInstanceOf[js.Any], tokenExpr = tokenExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDepsExpr]
  }
  @scala.inline
  implicit class AnonDepsExprOps[Self <: AnonDepsExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepsExpr(value: Expression): Self = {
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
    def withProviderExpr(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenExpr(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenExpr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

