package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageCommand", JSImport.Namespace)
@js.native
object deleteMessageCommandMod extends js.Object {
  @js.native
  class DeleteMessageCommand protected () extends Command[
          InputTypesUnion, 
          DeleteMessageInput, 
          OutputTypesUnion, 
          DeleteMessageOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteMessageInput) = this()
    val middlewareStack: MiddlewareStack[DeleteMessageInput, DeleteMessageOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
  }
  
}

