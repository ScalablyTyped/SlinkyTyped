package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/SendMessageBatchCommand", JSImport.Namespace)
@js.native
object sendMessageBatchCommandMod extends js.Object {
  
  @js.native
  class SendMessageBatchCommand protected () extends Command[
          InputTypesUnion, 
          SendMessageBatchInput, 
          OutputTypesUnion, 
          SendMessageBatchOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: SendMessageBatchInput) = this()
    
    val middlewareStack: MiddlewareStack[SendMessageBatchInput, SendMessageBatchOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
  }
}
