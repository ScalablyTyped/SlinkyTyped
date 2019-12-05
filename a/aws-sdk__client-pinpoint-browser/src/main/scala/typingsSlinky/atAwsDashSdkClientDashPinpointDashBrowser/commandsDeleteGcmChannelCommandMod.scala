package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteGcmChannelCommand", JSImport.Namespace)
@js.native
object commandsDeleteGcmChannelCommandMod extends js.Object {
  @js.native
  class DeleteGcmChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteGcmChannelInput, 
          OutputTypesUnion, 
          DeleteGcmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteGcmChannelInput) = this()
    /* CompleteClass */
    override val input: DeleteGcmChannelInput = js.native
    val middlewareStack: MiddlewareStack[DeleteGcmChannelInput, DeleteGcmChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteGcmChannelInput, DeleteGcmChannelOutput] = js.native
  }
  
}

