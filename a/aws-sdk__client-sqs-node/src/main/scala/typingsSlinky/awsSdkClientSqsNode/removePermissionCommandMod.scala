package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput
import typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/RemovePermissionCommand", JSImport.Namespace)
@js.native
object removePermissionCommandMod extends js.Object {
  @js.native
  class RemovePermissionCommand protected () extends Command[
          InputTypesUnion, 
          RemovePermissionInput, 
          OutputTypesUnion, 
          RemovePermissionOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: RemovePermissionInput) = this()
    /* CompleteClass */
    override val input: RemovePermissionInput = js.native
    val middlewareStack: MiddlewareStack[RemovePermissionInput, RemovePermissionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
  }
  
}

