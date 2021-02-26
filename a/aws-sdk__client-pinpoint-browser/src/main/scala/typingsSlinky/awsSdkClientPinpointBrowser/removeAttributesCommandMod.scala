package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeAttributesCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/RemoveAttributesCommand", "RemoveAttributesCommand")
  @js.native
  class RemoveAttributesCommand protected () extends Command[
          InputTypesUnion, 
          RemoveAttributesInput, 
          OutputTypesUnion, 
          RemoveAttributesOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: RemoveAttributesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[RemoveAttributesInput, RemoveAttributesOutput] = js.native
  }
}
