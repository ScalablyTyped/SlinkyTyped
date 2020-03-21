package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsVoipSandboxChannelCommand", JSImport.Namespace)
@js.native
object getApnsVoipSandboxChannelCommandMod extends js.Object {
  @js.native
  class GetApnsVoipSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          GetApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetApnsVoipSandboxChannelInput) = this()
    /* CompleteClass */
    override val input: GetApnsVoipSandboxChannelInput = js.native
    val middlewareStack: MiddlewareStack[
        GetApnsVoipSandboxChannelInput, 
        GetApnsVoipSandboxChannelOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsVoipSandboxChannelInput, GetApnsVoipSandboxChannelOutput] = js.native
  }
  
}

