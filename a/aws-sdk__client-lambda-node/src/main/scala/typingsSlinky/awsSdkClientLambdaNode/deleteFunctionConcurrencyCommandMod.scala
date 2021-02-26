package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyOutputMod.DeleteFunctionConcurrencyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteFunctionConcurrencyCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionConcurrencyCommand", "DeleteFunctionConcurrencyCommand")
  @js.native
  class DeleteFunctionConcurrencyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFunctionConcurrencyInput, 
          OutputTypesUnion, 
          DeleteFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteFunctionConcurrencyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
  }
}
