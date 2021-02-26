package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCampaignVersionsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionsCommand", "GetCampaignVersionsCommand")
  @js.native
  class GetCampaignVersionsCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignVersionsInput, 
          OutputTypesUnion, 
          GetCampaignVersionsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignVersionsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionsInput, GetCampaignVersionsOutput] = js.native
  }
}
