package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/SendUsersMessagesCommand", JSImport.Namespace)
@js.native
object sendUsersMessagesCommandMod extends js.Object {
  
  @js.native
  class SendUsersMessagesCommand protected () extends Command[
          InputTypesUnion, 
          SendUsersMessagesInput, 
          OutputTypesUnion, 
          SendUsersMessagesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: SendUsersMessagesInput) = this()
    
    val middlewareStack: MiddlewareStack[SendUsersMessagesInput, SendUsersMessagesOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
  }
}
