package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.coreMod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepsExpr extends js.Object {
  var depsExpr: typingsSlinky.angularCompiler.outputAstMod.Expression
  var flags: NodeFlags
  var providerExpr: typingsSlinky.angularCompiler.outputAstMod.Expression
  var tokenExpr: typingsSlinky.angularCompiler.outputAstMod.Expression
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
}

