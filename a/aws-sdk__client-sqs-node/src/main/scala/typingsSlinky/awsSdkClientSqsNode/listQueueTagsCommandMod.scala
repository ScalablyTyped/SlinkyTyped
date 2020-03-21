package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput
import typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListQueueTagsCommand", JSImport.Namespace)
@js.native
object listQueueTagsCommandMod extends js.Object {
  @js.native
  class ListQueueTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListQueueTagsInput, 
          OutputTypesUnion, 
          ListQueueTagsOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListQueueTagsInput) = this()
    /* CompleteClass */
    override val input: ListQueueTagsInput = js.native
    val middlewareStack: MiddlewareStack[ListQueueTagsInput, ListQueueTagsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueueTagsInput, ListQueueTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueueTagsInput, ListQueueTagsOutput] = js.native
  }
  
}

