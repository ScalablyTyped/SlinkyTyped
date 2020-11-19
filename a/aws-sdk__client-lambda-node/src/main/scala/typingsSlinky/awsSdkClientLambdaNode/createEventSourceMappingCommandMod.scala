package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingOutputMod.CreateEventSourceMappingOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/CreateEventSourceMappingCommand", JSImport.Namespace)
@js.native
object createEventSourceMappingCommandMod extends js.Object {
  
  @js.native
  class CreateEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          CreateEventSourceMappingInput, 
          OutputTypesUnion, 
          CreateEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateEventSourceMappingInput) = this()
    
    val middlewareStack: MiddlewareStack[CreateEventSourceMappingInput, CreateEventSourceMappingOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
  }
}
