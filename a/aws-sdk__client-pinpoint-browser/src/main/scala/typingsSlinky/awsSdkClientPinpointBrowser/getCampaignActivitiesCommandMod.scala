package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignActivitiesCommand", JSImport.Namespace)
@js.native
object getCampaignActivitiesCommandMod extends js.Object {
  
  @js.native
  class GetCampaignActivitiesCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignActivitiesInput, 
          OutputTypesUnion, 
          GetCampaignActivitiesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignActivitiesInput) = this()
    
    val middlewareStack: MiddlewareStack[GetCampaignActivitiesInput, GetCampaignActivitiesOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
  }
}
