package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetBaiduChannelCommand", JSImport.Namespace)
@js.native
object getBaiduChannelCommandMod extends js.Object {
  @js.native
  class GetBaiduChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetBaiduChannelInput, 
          OutputTypesUnion, 
          GetBaiduChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBaiduChannelInput) = this()
    /* CompleteClass */
    override val input: GetBaiduChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetBaiduChannelInput, GetBaiduChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetBaiduChannelInput, GetBaiduChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetBaiduChannelInput, GetBaiduChannelOutput] = js.native
  }
  
}

