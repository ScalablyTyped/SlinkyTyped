package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
import typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMessageVisibilityBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityBatchCommand", "ChangeMessageVisibilityBatchCommand")
  @js.native
  class ChangeMessageVisibilityBatchCommand protected () extends Command[
          InputTypesUnion, 
          ChangeMessageVisibilityBatchInput, 
          OutputTypesUnion, 
          ChangeMessageVisibilityBatchOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ChangeMessageVisibilityBatchInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
  }
}
