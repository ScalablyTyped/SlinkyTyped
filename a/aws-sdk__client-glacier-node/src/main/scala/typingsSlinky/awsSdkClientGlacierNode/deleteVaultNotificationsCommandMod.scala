package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsOutputMod.DeleteVaultNotificationsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultNotificationsCommand", JSImport.Namespace)
@js.native
object deleteVaultNotificationsCommandMod extends js.Object {
  @js.native
  class DeleteVaultNotificationsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultNotificationsInput, 
          OutputTypesUnion, 
          DeleteVaultNotificationsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultNotificationsInput) = this()
    /* CompleteClass */
    override val input: DeleteVaultNotificationsInput = js.native
    val middlewareStack: MiddlewareStack[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
  }
  
}

