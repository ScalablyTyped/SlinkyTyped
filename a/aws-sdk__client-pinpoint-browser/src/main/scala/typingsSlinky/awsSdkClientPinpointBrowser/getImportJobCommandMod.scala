package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getImportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobCommand", "GetImportJobCommand")
  @js.native
  class GetImportJobCommand protected () extends Command[
          InputTypesUnion, 
          GetImportJobInput, 
          OutputTypesUnion, 
          GetImportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetImportJobInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
  }
}
