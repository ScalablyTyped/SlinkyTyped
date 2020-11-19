package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetEventSourceMappingOutputMod.GetEventSourceMappingOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/GetEventSourceMappingCommand", JSImport.Namespace)
@js.native
object getEventSourceMappingCommandMod extends js.Object {
  
  @js.native
  class GetEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          GetEventSourceMappingInput, 
          OutputTypesUnion, 
          GetEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetEventSourceMappingInput) = this()
    
    val middlewareStack: MiddlewareStack[GetEventSourceMappingInput, GetEventSourceMappingOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
  }
}
