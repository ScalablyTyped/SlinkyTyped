package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput
import typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueueUrlCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/GetQueueUrlCommand", "GetQueueUrlCommand")
  @js.native
  class GetQueueUrlCommand protected () extends Command[
          InputTypesUnion, 
          GetQueueUrlInput, 
          OutputTypesUnion, 
          GetQueueUrlOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: GetQueueUrlInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
  }
}
