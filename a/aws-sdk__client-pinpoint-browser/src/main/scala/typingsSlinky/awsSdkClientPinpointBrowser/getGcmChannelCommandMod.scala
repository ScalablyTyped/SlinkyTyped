package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetGcmChannelCommand", JSImport.Namespace)
@js.native
object getGcmChannelCommandMod extends js.Object {
  @js.native
  class GetGcmChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetGcmChannelInput, 
          OutputTypesUnion, 
          GetGcmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetGcmChannelInput) = this()
    /* CompleteClass */
    override val input: GetGcmChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetGcmChannelInput, GetGcmChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetGcmChannelInput, GetGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetGcmChannelInput, GetGcmChannelOutput] = js.native
  }
  
}

