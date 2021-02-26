package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageCommand", "DeleteMessageCommand")
  @js.native
  class DeleteMessageCommand protected () extends Command[
          InputTypesUnion, 
          DeleteMessageInput, 
          OutputTypesUnion, 
          DeleteMessageOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: DeleteMessageInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
  }
}
