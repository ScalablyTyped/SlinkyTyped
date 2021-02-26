package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.Type
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("@angular/compiler/src/output/value_util", "QUOTED_KEYS")
  @js.native
  val QUOTED_KEYS: /* "$quoted$" */ String = js.native
  
  @JSImport("@angular/compiler/src/output/value_util", "convertValueToOutputAst")
  @js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any): Expression = js.native
  @JSImport("@angular/compiler/src/output/value_util", "convertValueToOutputAst")
  @js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any, `type`: Type): Expression = js.native
}
