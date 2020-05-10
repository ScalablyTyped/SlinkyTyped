package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
import typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListDeadLetterSourceQueuesCommand", JSImport.Namespace)
@js.native
object listDeadLetterSourceQueuesCommandMod extends js.Object {
  @js.native
  class ListDeadLetterSourceQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListDeadLetterSourceQueuesInput, 
          OutputTypesUnion, 
          ListDeadLetterSourceQueuesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListDeadLetterSourceQueuesInput) = this()
    val middlewareStack: MiddlewareStack[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
  }
  
}

