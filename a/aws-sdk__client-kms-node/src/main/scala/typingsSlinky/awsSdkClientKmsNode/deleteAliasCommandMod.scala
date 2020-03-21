package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput
import typingsSlinky.awsSdkClientKmsNode.typesDeleteAliasOutputMod.DeleteAliasOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DeleteAliasCommand", JSImport.Namespace)
@js.native
object deleteAliasCommandMod extends js.Object {
  @js.native
  class DeleteAliasCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAliasInput, 
          OutputTypesUnion, 
          DeleteAliasOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteAliasInput) = this()
    /* CompleteClass */
    override val input: DeleteAliasInput = js.native
    val middlewareStack: MiddlewareStack[DeleteAliasInput, DeleteAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
  }
  
}

