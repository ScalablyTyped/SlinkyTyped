package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/SendMessageCommand", JSImport.Namespace)
@js.native
object sendMessageCommandMod extends js.Object {
  
  @js.native
  class SendMessageCommand protected () extends Command[
          InputTypesUnion, 
          SendMessageInput, 
          OutputTypesUnion, 
          SendMessageOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: SendMessageInput) = this()
    
    val middlewareStack: MiddlewareStack[SendMessageInput, SendMessageOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageInput, SendMessageOutput] = js.native
  }
}
