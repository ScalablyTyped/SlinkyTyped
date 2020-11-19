package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsVoipChannelCommand", JSImport.Namespace)
@js.native
object updateApnsVoipChannelCommandMod extends js.Object {
  
  @js.native
  class UpdateApnsVoipChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApnsVoipChannelInput, 
          OutputTypesUnion, 
          UpdateApnsVoipChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApnsVoipChannelInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateApnsVoipChannelInput, UpdateApnsVoipChannelOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsVoipChannelInput, UpdateApnsVoipChannelOutput] = js.native
  }
}
