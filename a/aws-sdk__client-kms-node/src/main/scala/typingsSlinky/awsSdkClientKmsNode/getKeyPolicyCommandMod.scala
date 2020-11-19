package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
import typingsSlinky.awsSdkClientKmsNode.typesGetKeyPolicyOutputMod.GetKeyPolicyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/GetKeyPolicyCommand", JSImport.Namespace)
@js.native
object getKeyPolicyCommandMod extends js.Object {
  
  @js.native
  class GetKeyPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetKeyPolicyInput, 
          OutputTypesUnion, 
          GetKeyPolicyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetKeyPolicyInput) = this()
    
    val middlewareStack: MiddlewareStack[GetKeyPolicyInput, GetKeyPolicyOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
  }
}
