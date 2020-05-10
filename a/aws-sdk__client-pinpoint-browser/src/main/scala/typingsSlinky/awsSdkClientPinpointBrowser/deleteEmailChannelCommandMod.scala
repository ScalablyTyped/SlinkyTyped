package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEmailChannelCommand", JSImport.Namespace)
@js.native
object deleteEmailChannelCommandMod extends js.Object {
  @js.native
  class DeleteEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEmailChannelInput, 
          OutputTypesUnion, 
          DeleteEmailChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteEmailChannelInput) = this()
    val middlewareStack: MiddlewareStack[DeleteEmailChannelInput, DeleteEmailChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEmailChannelInput, DeleteEmailChannelOutput] = js.native
  }
  
}

