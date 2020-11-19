package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApplicationSettingsCommand", JSImport.Namespace)
@js.native
object getApplicationSettingsCommandMod extends js.Object {
  
  @js.native
  class GetApplicationSettingsCommand protected () extends Command[
          InputTypesUnion, 
          GetApplicationSettingsInput, 
          OutputTypesUnion, 
          GetApplicationSettingsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetApplicationSettingsInput) = this()
    
    val middlewareStack: MiddlewareStack[GetApplicationSettingsInput, GetApplicationSettingsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
  }
}
