package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEmailChannelCommand", JSImport.Namespace)
@js.native
object updateEmailChannelCommandMod extends js.Object {
  @js.native
  class UpdateEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEmailChannelInput, 
          OutputTypesUnion, 
          UpdateEmailChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateEmailChannelInput) = this()
    /* CompleteClass */
    override val input: UpdateEmailChannelInput = js.native
    val middlewareStack: MiddlewareStack[UpdateEmailChannelInput, UpdateEmailChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEmailChannelInput, UpdateEmailChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEmailChannelInput, UpdateEmailChannelOutput] = js.native
  }
  
}

