package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput
import typingsSlinky.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/UntagQueueCommand", JSImport.Namespace)
@js.native
object untagQueueCommandMod extends js.Object {
  
  @js.native
  class UntagQueueCommand protected () extends Command[
          InputTypesUnion, 
          UntagQueueInput, 
          OutputTypesUnion, 
          UntagQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: UntagQueueInput) = this()
    
    val middlewareStack: MiddlewareStack[UntagQueueInput, UntagQueueOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
  }
}
