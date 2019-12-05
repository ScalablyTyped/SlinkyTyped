package typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesPutKeyPolicyOutputMod.PutKeyPolicyOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/PutKeyPolicyCommand", JSImport.Namespace)
@js.native
object commandsPutKeyPolicyCommandMod extends js.Object {
  @js.native
  class PutKeyPolicyCommand protected () extends Command[
          InputTypesUnion, 
          PutKeyPolicyInput, 
          OutputTypesUnion, 
          PutKeyPolicyOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutKeyPolicyInput) = this()
    /* CompleteClass */
    override val input: PutKeyPolicyInput = js.native
    val middlewareStack: MiddlewareStack[PutKeyPolicyInput, PutKeyPolicyOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
  }
  
}

