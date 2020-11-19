package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput
import typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/GetQueueUrlCommand", JSImport.Namespace)
@js.native
object getQueueUrlCommandMod extends js.Object {
  
  @js.native
  class GetQueueUrlCommand protected () extends Command[
          InputTypesUnion, 
          GetQueueUrlInput, 
          OutputTypesUnion, 
          GetQueueUrlOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetQueueUrlInput) = this()
    
    val middlewareStack: MiddlewareStack[GetQueueUrlInput, GetQueueUrlOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
  }
}
