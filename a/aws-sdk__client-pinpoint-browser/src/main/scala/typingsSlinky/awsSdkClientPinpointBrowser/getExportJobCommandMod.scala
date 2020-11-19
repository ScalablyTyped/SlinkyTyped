package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobCommand", JSImport.Namespace)
@js.native
object getExportJobCommandMod extends js.Object {
  
  @js.native
  class GetExportJobCommand protected () extends Command[
          InputTypesUnion, 
          GetExportJobInput, 
          OutputTypesUnion, 
          GetExportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetExportJobInput) = this()
    
    val middlewareStack: MiddlewareStack[GetExportJobInput, GetExportJobOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobInput, GetExportJobOutput] = js.native
  }
}
