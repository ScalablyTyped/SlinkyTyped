package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyOutputMod.DeleteVaultAccessPolicyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultAccessPolicyCommand", JSImport.Namespace)
@js.native
object deleteVaultAccessPolicyCommandMod extends js.Object {
  @js.native
  class DeleteVaultAccessPolicyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultAccessPolicyInput, 
          OutputTypesUnion, 
          DeleteVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultAccessPolicyInput) = this()
    /* CompleteClass */
    override val input: DeleteVaultAccessPolicyInput = js.native
    val middlewareStack: MiddlewareStack[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
  }
  
}

