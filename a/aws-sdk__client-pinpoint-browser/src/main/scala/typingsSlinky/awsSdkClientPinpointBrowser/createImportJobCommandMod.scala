package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createImportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateImportJobCommand", "CreateImportJobCommand")
  @js.native
  class CreateImportJobCommand protected () extends Command[
          InputTypesUnion, 
          CreateImportJobInput, 
          OutputTypesUnion, 
          CreateImportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateImportJobInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
  }
}
