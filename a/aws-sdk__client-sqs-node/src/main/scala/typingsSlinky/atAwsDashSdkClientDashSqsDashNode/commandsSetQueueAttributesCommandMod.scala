package typingsSlinky.atAwsDashSdkClientDashSqsDashNode

import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SetQueueAttributesCommand", JSImport.Namespace)
@js.native
object commandsSetQueueAttributesCommandMod extends js.Object {
  @js.native
  class SetQueueAttributesCommand protected () extends Command[
          InputTypesUnion, 
          SetQueueAttributesInput, 
          OutputTypesUnion, 
          SetQueueAttributesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetQueueAttributesInput) = this()
    /* CompleteClass */
    override val input: SetQueueAttributesInput = js.native
    val middlewareStack: MiddlewareStack[SetQueueAttributesInput, SetQueueAttributesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
  }
  
}

