package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateCampaignCommand", "CreateCampaignCommand")
  @js.native
  class CreateCampaignCommand protected () extends Command[
          InputTypesUnion, 
          CreateCampaignInput, 
          OutputTypesUnion, 
          CreateCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateCampaignInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateCampaignInput, CreateCampaignOutput] = js.native
  }
}
