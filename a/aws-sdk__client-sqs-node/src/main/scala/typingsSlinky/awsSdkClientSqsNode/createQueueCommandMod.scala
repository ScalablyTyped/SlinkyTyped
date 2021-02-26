package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/CreateQueueCommand", "CreateQueueCommand")
  @js.native
  class CreateQueueCommand protected () extends Command[
          InputTypesUnion, 
          CreateQueueInput, 
          OutputTypesUnion, 
          CreateQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: CreateQueueInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
  }
}
