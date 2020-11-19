package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyOutputMod.SetVaultAccessPolicyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/SetVaultAccessPolicyCommand", JSImport.Namespace)
@js.native
object setVaultAccessPolicyCommandMod extends js.Object {
  
  @js.native
  class SetVaultAccessPolicyCommand protected () extends Command[
          InputTypesUnion, 
          SetVaultAccessPolicyInput, 
          OutputTypesUnion, 
          SetVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetVaultAccessPolicyInput) = this()
    
    val middlewareStack: MiddlewareStack[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
  }
}
