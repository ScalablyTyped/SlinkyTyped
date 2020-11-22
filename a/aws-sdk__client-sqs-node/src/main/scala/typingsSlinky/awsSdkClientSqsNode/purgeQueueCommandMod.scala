package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/PurgeQueueCommand", JSImport.Namespace)
@js.native
object purgeQueueCommandMod extends js.Object {
  
  @js.native
  class PurgeQueueCommand protected () extends Command[
          InputTypesUnion, 
          PurgeQueueInput, 
          OutputTypesUnion, 
          PurgeQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: PurgeQueueInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
  }
}
