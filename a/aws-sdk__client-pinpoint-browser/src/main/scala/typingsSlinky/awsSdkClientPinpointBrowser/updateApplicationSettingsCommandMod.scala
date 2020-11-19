package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApplicationSettingsCommand", JSImport.Namespace)
@js.native
object updateApplicationSettingsCommandMod extends js.Object {
  
  @js.native
  class UpdateApplicationSettingsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApplicationSettingsInput, 
          OutputTypesUnion, 
          UpdateApplicationSettingsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApplicationSettingsInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
  }
}
