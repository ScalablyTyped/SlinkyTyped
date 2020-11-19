package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput
import typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/ReceiveMessageCommand", JSImport.Namespace)
@js.native
object receiveMessageCommandMod extends js.Object {
  
  @js.native
  class ReceiveMessageCommand protected () extends Command[
          InputTypesUnion, 
          ReceiveMessageInput, 
          OutputTypesUnion, 
          ReceiveMessageOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ReceiveMessageInput) = this()
    
    val middlewareStack: MiddlewareStack[ReceiveMessageInput, ReceiveMessageOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
  }
}
