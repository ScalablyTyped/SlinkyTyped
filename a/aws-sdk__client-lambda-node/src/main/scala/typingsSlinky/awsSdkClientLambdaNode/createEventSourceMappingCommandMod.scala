package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingOutputMod.CreateEventSourceMappingOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createEventSourceMappingCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/CreateEventSourceMappingCommand", "CreateEventSourceMappingCommand")
  @js.native
  class CreateEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          CreateEventSourceMappingInput, 
          OutputTypesUnion, 
          CreateEventSourceMappingOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: CreateEventSourceMappingInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
  }
}
