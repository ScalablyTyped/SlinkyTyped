package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
import typingsSlinky.awsSdkClientLambdaNode.typesPutFunctionConcurrencyOutputMod.PutFunctionConcurrencyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/PutFunctionConcurrencyCommand", JSImport.Namespace)
@js.native
object putFunctionConcurrencyCommandMod extends js.Object {
  
  @js.native
  class PutFunctionConcurrencyCommand protected () extends Command[
          InputTypesUnion, 
          PutFunctionConcurrencyInput, 
          OutputTypesUnion, 
          PutFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutFunctionConcurrencyInput) = this()
    
    val middlewareStack: MiddlewareStack[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
  }
}
