package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.atAngularCompilerStrings.DollarquotedDollar
import typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type
import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/value_util", JSImport.Namespace)
@js.native
object srcOutputValueUnderscoreUtilMod extends js.Object {
  val QUOTED_KEYS: DollarquotedDollar = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any): Expression = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any, `type`: Type): Expression = js.native
}

