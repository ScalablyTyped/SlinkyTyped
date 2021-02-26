package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionOutputMod.DeleteFunctionOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteFunctionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionCommand", "DeleteFunctionCommand")
  @js.native
  class DeleteFunctionCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFunctionInput, 
          OutputTypesUnion, 
          DeleteFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteFunctionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionInput, DeleteFunctionOutput] = js.native
  }
}
