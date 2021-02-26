package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import typingsSlinky.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionOutputMod.UpdateKeyDescriptionOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateKeyDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/UpdateKeyDescriptionCommand", "UpdateKeyDescriptionCommand")
  @js.native
  class UpdateKeyDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateKeyDescriptionInput, 
          OutputTypesUnion, 
          UpdateKeyDescriptionOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: UpdateKeyDescriptionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
  }
}
