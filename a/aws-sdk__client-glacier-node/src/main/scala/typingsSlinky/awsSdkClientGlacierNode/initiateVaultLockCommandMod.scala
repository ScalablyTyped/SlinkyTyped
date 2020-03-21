package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod.InitiateVaultLockOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateVaultLockCommand", JSImport.Namespace)
@js.native
object initiateVaultLockCommandMod extends js.Object {
  @js.native
  class InitiateVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          InitiateVaultLockInput, 
          OutputTypesUnion, 
          InitiateVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: InitiateVaultLockInput) = this()
    /* CompleteClass */
    override val input: InitiateVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[InitiateVaultLockInput, InitiateVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
  }
  
}

