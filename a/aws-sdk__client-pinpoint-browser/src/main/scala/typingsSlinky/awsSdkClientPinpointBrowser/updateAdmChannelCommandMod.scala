package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateAdmChannelCommand", JSImport.Namespace)
@js.native
object updateAdmChannelCommandMod extends js.Object {
  @js.native
  class UpdateAdmChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateAdmChannelInput, 
          OutputTypesUnion, 
          UpdateAdmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateAdmChannelInput) = this()
    val middlewareStack: MiddlewareStack[UpdateAdmChannelInput, UpdateAdmChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateAdmChannelInput, UpdateAdmChannelOutput] = js.native
  }
  
}

