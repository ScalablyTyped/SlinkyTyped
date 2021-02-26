package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getExportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobCommand", "GetExportJobCommand")
  @js.native
  class GetExportJobCommand protected () extends Command[
          InputTypesUnion, 
          GetExportJobInput, 
          OutputTypesUnion, 
          GetExportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetExportJobInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobInput, GetExportJobOutput] = js.native
  }
}
