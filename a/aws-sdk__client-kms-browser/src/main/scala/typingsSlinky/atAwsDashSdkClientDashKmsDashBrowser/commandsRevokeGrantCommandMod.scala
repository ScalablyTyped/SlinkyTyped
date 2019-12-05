package typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesRevokeGrantInputMod.RevokeGrantInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesRevokeGrantOutputMod.RevokeGrantOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/RevokeGrantCommand", JSImport.Namespace)
@js.native
object commandsRevokeGrantCommandMod extends js.Object {
  @js.native
  class RevokeGrantCommand protected () extends Command[
          InputTypesUnion, 
          RevokeGrantInput, 
          OutputTypesUnion, 
          RevokeGrantOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: RevokeGrantInput) = this()
    /* CompleteClass */
    override val input: RevokeGrantInput = js.native
    val middlewareStack: MiddlewareStack[RevokeGrantInput, RevokeGrantOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
  }
  
}

