package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageBatchCommand", JSImport.Namespace)
@js.native
object deleteMessageBatchCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[DeleteMessageBatchInput, DeleteMessageBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
  }
  
}

