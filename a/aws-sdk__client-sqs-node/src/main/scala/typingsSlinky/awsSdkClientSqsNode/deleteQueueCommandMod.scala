package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteQueueCommand", JSImport.Namespace)
@js.native
object deleteQueueCommandMod extends js.Object {
  
  @js.native
  class DeleteQueueCommand protected () extends Command[
          InputTypesUnion, 
          DeleteQueueInput, 
          OutputTypesUnion, 
          DeleteQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: DeleteQueueInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
  }
}
