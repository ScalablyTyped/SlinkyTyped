package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationOutputMod.UpdateFunctionConfigurationOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionConfigurationCommand", JSImport.Namespace)
@js.native
object updateFunctionConfigurationCommandMod extends js.Object {
  
  @js.native
  class UpdateFunctionConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          UpdateFunctionConfigurationInput, 
          OutputTypesUnion, 
          UpdateFunctionConfigurationOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: UpdateFunctionConfigurationInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
  }
}
