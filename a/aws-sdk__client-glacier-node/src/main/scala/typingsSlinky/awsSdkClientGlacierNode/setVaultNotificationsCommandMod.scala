package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsOutputMod.SetVaultNotificationsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/SetVaultNotificationsCommand", JSImport.Namespace)
@js.native
object setVaultNotificationsCommandMod extends js.Object {
  
  @js.native
  class SetVaultNotificationsCommand protected () extends Command[
          InputTypesUnion, 
          SetVaultNotificationsInput, 
          OutputTypesUnion, 
          SetVaultNotificationsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetVaultNotificationsInput) = this()
    
    val middlewareStack: MiddlewareStack[SetVaultNotificationsInput, SetVaultNotificationsOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
  }
}
