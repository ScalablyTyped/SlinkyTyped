package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteSmsChannelCommand", JSImport.Namespace)
@js.native
object deleteSmsChannelCommandMod extends js.Object {
  
  @js.native
  class DeleteSmsChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSmsChannelInput, 
          OutputTypesUnion, 
          DeleteSmsChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteSmsChannelInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteSmsChannelInput, DeleteSmsChannelOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSmsChannelInput, DeleteSmsChannelOutput] = js.native
  }
}
