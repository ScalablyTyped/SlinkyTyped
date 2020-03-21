package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateSmsChannelCommand", JSImport.Namespace)
@js.native
object updateSmsChannelCommandMod extends js.Object {
  @js.native
  class UpdateSmsChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateSmsChannelInput, 
          OutputTypesUnion, 
          UpdateSmsChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateSmsChannelInput) = this()
    /* CompleteClass */
    override val input: UpdateSmsChannelInput = js.native
    val middlewareStack: MiddlewareStack[UpdateSmsChannelInput, UpdateSmsChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSmsChannelInput, UpdateSmsChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSmsChannelInput, UpdateSmsChannelOutput] = js.native
  }
  
}

