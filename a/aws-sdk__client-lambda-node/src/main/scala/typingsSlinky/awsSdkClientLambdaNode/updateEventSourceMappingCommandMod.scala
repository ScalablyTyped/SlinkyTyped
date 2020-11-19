package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateEventSourceMappingOutputMod.UpdateEventSourceMappingOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateEventSourceMappingCommand", JSImport.Namespace)
@js.native
object updateEventSourceMappingCommandMod extends js.Object {
  
  @js.native
  class UpdateEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEventSourceMappingInput, 
          OutputTypesUnion, 
          UpdateEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateEventSourceMappingInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
  }
}
