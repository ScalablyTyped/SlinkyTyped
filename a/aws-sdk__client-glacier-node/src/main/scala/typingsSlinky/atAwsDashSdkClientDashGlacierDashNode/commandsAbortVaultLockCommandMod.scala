package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesAbortVaultLockInputMod.AbortVaultLockInput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesAbortVaultLockOutputMod.AbortVaultLockOutput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AbortVaultLockCommand", JSImport.Namespace)
@js.native
object commandsAbortVaultLockCommandMod extends js.Object {
  @js.native
  class AbortVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          AbortVaultLockInput, 
          OutputTypesUnion, 
          AbortVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: AbortVaultLockInput) = this()
    /* CompleteClass */
    override val input: AbortVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[AbortVaultLockInput, AbortVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
  }
  
}

