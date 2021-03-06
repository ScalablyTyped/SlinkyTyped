package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteEventSourceMappingOutputMod.DeleteEventSourceMappingOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteEventSourceMappingCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteEventSourceMappingCommand", "DeleteEventSourceMappingCommand")
  @js.native
  class DeleteEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEventSourceMappingInput, 
          OutputTypesUnion, 
          DeleteEventSourceMappingOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteEventSourceMappingInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
  }
}
