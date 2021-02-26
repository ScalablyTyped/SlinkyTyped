package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCampaignVersionCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionCommand", "GetCampaignVersionCommand")
  @js.native
  class GetCampaignVersionCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignVersionInput, 
          OutputTypesUnion, 
          GetCampaignVersionOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignVersionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
  }
}
