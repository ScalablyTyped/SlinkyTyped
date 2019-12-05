package typingsSlinky.atAwsDashSdkClientDashSqsDashNode

import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/GetQueueAttributesCommand", JSImport.Namespace)
@js.native
object commandsGetQueueAttributesCommandMod extends js.Object {
  @js.native
  class GetQueueAttributesCommand protected () extends Command[
          InputTypesUnion, 
          GetQueueAttributesInput, 
          OutputTypesUnion, 
          GetQueueAttributesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetQueueAttributesInput) = this()
    /* CompleteClass */
    override val input: GetQueueAttributesInput = js.native
    val middlewareStack: MiddlewareStack[GetQueueAttributesInput, GetQueueAttributesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
  }
  
}

