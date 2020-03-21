package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PhoneNumberValidateCommand", JSImport.Namespace)
@js.native
object phoneNumberValidateCommandMod extends js.Object {
  @js.native
  class PhoneNumberValidateCommand protected () extends Command[
          InputTypesUnion, 
          PhoneNumberValidateInput, 
          OutputTypesUnion, 
          PhoneNumberValidateOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PhoneNumberValidateInput) = this()
    /* CompleteClass */
    override val input: PhoneNumberValidateInput = js.native
    val middlewareStack: MiddlewareStack[PhoneNumberValidateInput, PhoneNumberValidateOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
  }
  
}

