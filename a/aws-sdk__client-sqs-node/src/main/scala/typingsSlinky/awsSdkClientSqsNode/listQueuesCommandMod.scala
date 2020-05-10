package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
import typingsSlinky.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListQueuesCommand", JSImport.Namespace)
@js.native
object listQueuesCommandMod extends js.Object {
  @js.native
  class ListQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListQueuesInput, 
          OutputTypesUnion, 
          ListQueuesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListQueuesInput) = this()
    val middlewareStack: MiddlewareStack[ListQueuesInput, ListQueuesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueuesInput, ListQueuesOutput] = js.native
  }
  
}

