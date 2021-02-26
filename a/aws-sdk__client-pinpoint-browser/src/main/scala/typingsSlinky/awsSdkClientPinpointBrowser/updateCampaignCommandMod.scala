package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateCampaignCommand", "UpdateCampaignCommand")
  @js.native
  class UpdateCampaignCommand protected () extends Command[
          InputTypesUnion, 
          UpdateCampaignInput, 
          OutputTypesUnion, 
          UpdateCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateCampaignInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
  }
}
