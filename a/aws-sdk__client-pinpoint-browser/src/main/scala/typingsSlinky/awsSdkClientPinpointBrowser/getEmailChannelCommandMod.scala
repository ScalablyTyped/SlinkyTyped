package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEmailChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEmailChannelCommand", "GetEmailChannelCommand")
  @js.native
  class GetEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetEmailChannelInput, 
          OutputTypesUnion, 
          GetEmailChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetEmailChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEmailChannelInput, GetEmailChannelOutput] = js.native
  }
}
