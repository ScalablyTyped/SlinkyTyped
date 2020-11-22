package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignCommand", JSImport.Namespace)
@js.native
object getCampaignCommandMod extends js.Object {
  
  @js.native
  class GetCampaignCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignInput, 
          OutputTypesUnion, 
          GetCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignInput, GetCampaignOutput] = js.native
  }
}
