package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import typingsSlinky.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionOutputMod.UpdateKeyDescriptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/UpdateKeyDescriptionCommand", JSImport.Namespace)
@js.native
object updateKeyDescriptionCommandMod extends js.Object {
  
  @js.native
  class UpdateKeyDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateKeyDescriptionInput, 
          OutputTypesUnion, 
          UpdateKeyDescriptionOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateKeyDescriptionInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
  }
}
