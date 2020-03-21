package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateGcmChannelCommand", JSImport.Namespace)
@js.native
object updateGcmChannelCommandMod extends js.Object {
  @js.native
  class UpdateGcmChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGcmChannelInput, 
          OutputTypesUnion, 
          UpdateGcmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateGcmChannelInput) = this()
    /* CompleteClass */
    override val input: UpdateGcmChannelInput = js.native
    val middlewareStack: MiddlewareStack[UpdateGcmChannelInput, UpdateGcmChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
  }
  
}

