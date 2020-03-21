package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput
import typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityCommand", JSImport.Namespace)
@js.native
object changeMessageVisibilityCommandMod extends js.Object {
  @js.native
  class ChangeMessageVisibilityCommand protected () extends Command[
          InputTypesUnion, 
          ChangeMessageVisibilityInput, 
          OutputTypesUnion, 
          ChangeMessageVisibilityOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ChangeMessageVisibilityInput) = this()
    /* CompleteClass */
    override val input: ChangeMessageVisibilityInput = js.native
    val middlewareStack: MiddlewareStack[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput] = js.native
  }
  
}

