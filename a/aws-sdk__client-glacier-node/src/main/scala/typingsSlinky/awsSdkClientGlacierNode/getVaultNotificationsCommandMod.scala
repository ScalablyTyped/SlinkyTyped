package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod.GetVaultNotificationsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultNotificationsCommand", JSImport.Namespace)
@js.native
object getVaultNotificationsCommandMod extends js.Object {
  @js.native
  class GetVaultNotificationsCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultNotificationsInput, 
          OutputTypesUnion, 
          GetVaultNotificationsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetVaultNotificationsInput) = this()
    val middlewareStack: MiddlewareStack[GetVaultNotificationsInput, GetVaultNotificationsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
  }
  
}

