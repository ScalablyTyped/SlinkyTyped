package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/PurgeQueueCommand", JSImport.Namespace)
@js.native
object purgeQueueCommandMod extends js.Object {
  @js.native
  class PurgeQueueCommand protected () extends Command[
          InputTypesUnion, 
          PurgeQueueInput, 
          OutputTypesUnion, 
          PurgeQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: PurgeQueueInput) = this()
    /* CompleteClass */
    override val input: PurgeQueueInput = js.native
    val middlewareStack: MiddlewareStack[PurgeQueueInput, PurgeQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
  }
  
}

