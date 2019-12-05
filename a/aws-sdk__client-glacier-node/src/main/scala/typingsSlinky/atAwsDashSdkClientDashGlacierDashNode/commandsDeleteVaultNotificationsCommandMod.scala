package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesDeleteVaultNotificationsOutputMod.DeleteVaultNotificationsOutput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultNotificationsCommand", JSImport.Namespace)
@js.native
object commandsDeleteVaultNotificationsCommandMod extends js.Object {
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
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
  }
  
}

