package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAppInputMod.GetAppInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAppOutputMod.GetAppOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppCommand", JSImport.Namespace)
@js.native
object commandsGetAppCommandMod extends js.Object {
  @js.native
  class GetAppCommand protected () extends Command[
          InputTypesUnion, 
          GetAppInput, 
          OutputTypesUnion, 
          GetAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAppInput) = this()
    /* CompleteClass */
    override val input: GetAppInput = js.native
    val middlewareStack: MiddlewareStack[GetAppInput, GetAppOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
  }
  
}

