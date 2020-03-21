package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAdmChannelCommand", JSImport.Namespace)
@js.native
object getAdmChannelCommandMod extends js.Object {
  @js.native
  class GetAdmChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetAdmChannelInput, 
          OutputTypesUnion, 
          GetAdmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAdmChannelInput) = this()
    /* CompleteClass */
    override val input: GetAdmChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetAdmChannelInput, GetAdmChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
  }
  
}

