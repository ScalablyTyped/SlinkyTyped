package typingsSlinky.atAwsDashSdkClientDashSqsDashNode

import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageBatchCommand", JSImport.Namespace)
@js.native
object commandsDeleteMessageBatchCommandMod extends js.Object {
  @js.native
  class DeleteMessageBatchCommand protected () extends Command[
          InputTypesUnion, 
          DeleteMessageBatchInput, 
          OutputTypesUnion, 
          DeleteMessageBatchOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteMessageBatchInput) = this()
    /* CompleteClass */
    override val input: DeleteMessageBatchInput = js.native
    val middlewareStack: MiddlewareStack[DeleteMessageBatchInput, DeleteMessageBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
  }
  
}

