package typingsSlinky.atAwsDashSdkClientDashLambdaDashNode

import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingOutputMod.UpdateEventSourceMappingOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateEventSourceMappingCommand", JSImport.Namespace)
@js.native
object commandsUpdateEventSourceMappingCommandMod extends js.Object {
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
    /* CompleteClass */
    override val input: UpdateEventSourceMappingInput = js.native
    val middlewareStack: MiddlewareStack[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
  }
  
}

