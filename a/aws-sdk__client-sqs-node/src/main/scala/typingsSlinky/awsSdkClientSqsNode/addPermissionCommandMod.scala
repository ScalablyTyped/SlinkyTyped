package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput
import typingsSlinky.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/AddPermissionCommand", JSImport.Namespace)
@js.native
object addPermissionCommandMod extends js.Object {
  @js.native
  class AddPermissionCommand protected () extends Command[
          InputTypesUnion, 
          AddPermissionInput, 
          OutputTypesUnion, 
          AddPermissionOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: AddPermissionInput) = this()
    /* CompleteClass */
    override val input: AddPermissionInput = js.native
    val middlewareStack: MiddlewareStack[AddPermissionInput, AddPermissionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
  }
  
}

