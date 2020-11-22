package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput
import typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/ListQueueTagsCommand", JSImport.Namespace)
@js.native
object listQueueTagsCommandMod extends js.Object {
  
  @js.native
  class ListQueueTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListQueueTagsInput, 
          OutputTypesUnion, 
          ListQueueTagsOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ListQueueTagsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueueTagsInput, ListQueueTagsOutput] = js.native
  }
}
