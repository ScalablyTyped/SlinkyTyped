package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/CreateQueueCommand", JSImport.Namespace)
@js.native
object createQueueCommandMod extends js.Object {
  @js.native
  class CreateQueueCommand protected () extends Command[
          InputTypesUnion, 
          CreateQueueInput, 
          OutputTypesUnion, 
          CreateQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateQueueInput) = this()
    /* CompleteClass */
    override val input: CreateQueueInput = js.native
    val middlewareStack: MiddlewareStack[CreateQueueInput, CreateQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
  }
  
}

