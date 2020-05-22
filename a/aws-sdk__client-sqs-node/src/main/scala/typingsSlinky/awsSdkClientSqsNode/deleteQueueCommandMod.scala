package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteQueueCommand", JSImport.Namespace)
@js.native
object deleteQueueCommandMod extends js.Object {
  @js.native
  class DeleteQueueCommand protected () extends Command[
          InputTypesUnion, 
          DeleteQueueInput, 
          OutputTypesUnion, 
          DeleteQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteQueueInput) = this()
    /* CompleteClass */
    override val input: DeleteQueueInput = js.native
    val middlewareStack: MiddlewareStack[DeleteQueueInput, DeleteQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
  }
  
}

