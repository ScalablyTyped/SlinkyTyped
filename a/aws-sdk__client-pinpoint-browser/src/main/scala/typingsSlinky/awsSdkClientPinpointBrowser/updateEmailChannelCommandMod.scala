package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateEmailChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEmailChannelCommand", "UpdateEmailChannelCommand")
  @js.native
  class UpdateEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEmailChannelInput, 
          OutputTypesUnion, 
          UpdateEmailChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateEmailChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEmailChannelInput, UpdateEmailChannelOutput] = js.native
  }
}
