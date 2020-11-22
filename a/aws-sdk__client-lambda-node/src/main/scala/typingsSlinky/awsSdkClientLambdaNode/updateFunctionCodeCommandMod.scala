package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionCodeOutputMod.UpdateFunctionCodeOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionCodeCommand", JSImport.Namespace)
@js.native
object updateFunctionCodeCommandMod extends js.Object {
  
  @js.native
  class UpdateFunctionCodeCommand protected () extends Command[
          InputTypesUnion, 
          UpdateFunctionCodeInput, 
          OutputTypesUnion, 
          UpdateFunctionCodeOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: UpdateFunctionCodeInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionCodeInput, UpdateFunctionCodeOutput] = js.native
  }
}
