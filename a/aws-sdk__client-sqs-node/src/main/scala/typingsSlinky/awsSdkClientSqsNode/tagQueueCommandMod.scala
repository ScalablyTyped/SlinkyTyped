package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/TagQueueCommand", JSImport.Namespace)
@js.native
object tagQueueCommandMod extends js.Object {
  @js.native
  class TagQueueCommand protected () extends Command[
          InputTypesUnion, 
          TagQueueInput, 
          OutputTypesUnion, 
          TagQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: TagQueueInput) = this()
    /* CompleteClass */
    override val input: TagQueueInput = js.native
    val middlewareStack: MiddlewareStack[TagQueueInput, TagQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
  }
  
}

