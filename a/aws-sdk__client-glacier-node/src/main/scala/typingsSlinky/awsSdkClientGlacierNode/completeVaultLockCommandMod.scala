package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockOutputMod.CompleteVaultLockOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/CompleteVaultLockCommand", JSImport.Namespace)
@js.native
object completeVaultLockCommandMod extends js.Object {
  @js.native
  class CompleteVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          CompleteVaultLockInput, 
          OutputTypesUnion, 
          CompleteVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: CompleteVaultLockInput) = this()
    /* CompleteClass */
    override val input: CompleteVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[CompleteVaultLockInput, CompleteVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[CompleteVaultLockInput, CompleteVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[CompleteVaultLockInput, CompleteVaultLockOutput] = js.native
  }
  
}

