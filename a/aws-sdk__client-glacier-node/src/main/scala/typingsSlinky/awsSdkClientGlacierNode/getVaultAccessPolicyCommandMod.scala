package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyOutputMod.GetVaultAccessPolicyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultAccessPolicyCommand", JSImport.Namespace)
@js.native
object getVaultAccessPolicyCommandMod extends js.Object {
  @js.native
  class GetVaultAccessPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultAccessPolicyInput, 
          OutputTypesUnion, 
          GetVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetVaultAccessPolicyInput) = this()
    val middlewareStack: MiddlewareStack[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
  }
  
}

