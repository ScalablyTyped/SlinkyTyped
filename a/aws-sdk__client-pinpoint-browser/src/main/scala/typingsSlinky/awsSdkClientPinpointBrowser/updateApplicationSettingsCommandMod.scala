package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    /* CompleteClass */
    override val input: UpdateApplicationSettingsInput = js.native
    val middlewareStack: MiddlewareStack[
        UpdateApplicationSettingsInput, 
        UpdateApplicationSettingsOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
  }
  
}

