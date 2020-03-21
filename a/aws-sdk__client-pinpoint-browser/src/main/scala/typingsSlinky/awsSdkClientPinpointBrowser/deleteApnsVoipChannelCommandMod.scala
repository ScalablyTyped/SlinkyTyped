package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsVoipChannelCommand", JSImport.Namespace)
@js.native
object deleteApnsVoipChannelCommandMod extends js.Object {
  @js.native
  class DeleteApnsVoipChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteApnsVoipChannelInput, 
          OutputTypesUnion, 
          DeleteApnsVoipChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteApnsVoipChannelInput) = this()
    /* CompleteClass */
    override val input: DeleteApnsVoipChannelInput = js.native
    val middlewareStack: MiddlewareStack[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsVoipChannelInput, DeleteApnsVoipChannelOutput] = js.native
  }
  
}

