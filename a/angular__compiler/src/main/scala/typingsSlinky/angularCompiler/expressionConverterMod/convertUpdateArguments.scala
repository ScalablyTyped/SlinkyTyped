package typingsSlinky.angularCompiler.expressionConverterMod

import typingsSlinky.angularCompiler.anon.Args
import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertUpdateArguments")
@js.native
object convertUpdateArguments extends js.Object {
  
  def apply(
    localResolver: LocalResolver,
    contextVariableExpression: Expression,
    expressionWithArgumentsToExtract: AST,
    bindingId: String
  ): Args = js.native
}
