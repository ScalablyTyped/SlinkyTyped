package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
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
          SQSResolvedConfiguration
        ] {
    def this(input: SendMessageBatchInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
  }
}
