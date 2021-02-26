package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
import typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueueAttributesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/GetQueueAttributesCommand", "GetQueueAttributesCommand")
  @js.native
  class GetQueueAttributesCommand protected () extends Command[
          InputTypesUnion, 
          GetQueueAttributesInput, 
          OutputTypesUnion, 
          GetQueueAttributesOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: GetQueueAttributesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
  }
}
