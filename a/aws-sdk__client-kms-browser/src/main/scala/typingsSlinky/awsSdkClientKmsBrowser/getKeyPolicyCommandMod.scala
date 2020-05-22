package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput
import typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyPolicyOutputMod.GetKeyPolicyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GetKeyPolicyCommand", JSImport.Namespace)
@js.native
object getKeyPolicyCommandMod extends js.Object {
  @js.native
  class GetKeyPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetKeyPolicyInput, 
          OutputTypesUnion, 
          GetKeyPolicyOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetKeyPolicyInput) = this()
    /* CompleteClass */
    override val input: GetKeyPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetKeyPolicyInput, GetKeyPolicyOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
  }
  
}

