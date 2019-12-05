package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultLockInputMod.GetVaultLockInput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultLockOutputMod.GetVaultLockOutput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultLockCommand", JSImport.Namespace)
@js.native
object commandsGetVaultLockCommandMod extends js.Object {
  @js.native
  class GetVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultLockInput, 
          OutputTypesUnion, 
          GetVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetVaultLockInput) = this()
    /* CompleteClass */
    override val input: GetVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[GetVaultLockInput, GetVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
  }
  
}

