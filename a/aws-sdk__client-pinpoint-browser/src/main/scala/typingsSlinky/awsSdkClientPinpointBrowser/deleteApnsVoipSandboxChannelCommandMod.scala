package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsVoipSandboxChannelCommand", JSImport.Namespace)
@js.native
object deleteApnsVoipSandboxChannelCommandMod extends js.Object {
  
  @js.native
  class DeleteApnsVoipSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          DeleteApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteApnsVoipSandboxChannelInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput] = js.native
  }
}
