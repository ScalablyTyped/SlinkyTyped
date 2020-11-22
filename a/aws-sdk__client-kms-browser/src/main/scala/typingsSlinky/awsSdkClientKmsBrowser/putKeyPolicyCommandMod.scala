package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput
import typingsSlinky.awsSdkClientKmsBrowser.typesPutKeyPolicyOutputMod.PutKeyPolicyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/PutKeyPolicyCommand", JSImport.Namespace)
@js.native
object putKeyPolicyCommandMod extends js.Object {
  
  @js.native
  class PutKeyPolicyCommand protected () extends Command[
          InputTypesUnion, 
          PutKeyPolicyInput, 
          OutputTypesUnion, 
          PutKeyPolicyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: PutKeyPolicyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
  }
}
