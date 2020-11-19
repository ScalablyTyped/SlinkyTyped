package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
import typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/SetQueueAttributesCommand", JSImport.Namespace)
@js.native
object setQueueAttributesCommandMod extends js.Object {
  
  @js.native
  class SetQueueAttributesCommand protected () extends Command[
          InputTypesUnion, 
          SetQueueAttributesInput, 
          OutputTypesUnion, 
          SetQueueAttributesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetQueueAttributesInput) = this()
    
    val middlewareStack: MiddlewareStack[SetQueueAttributesInput, SetQueueAttributesOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
  }
}
