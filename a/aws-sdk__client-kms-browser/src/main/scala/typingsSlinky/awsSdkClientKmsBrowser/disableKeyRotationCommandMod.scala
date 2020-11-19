package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/DisableKeyRotationCommand", JSImport.Namespace)
@js.native
object disableKeyRotationCommandMod extends js.Object {
  
  @js.native
  class DisableKeyRotationCommand protected () extends Command[
          InputTypesUnion, 
          DisableKeyRotationInput, 
          OutputTypesUnion, 
          DisableKeyRotationOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: DisableKeyRotationInput) = this()
    
    val middlewareStack: MiddlewareStack[DisableKeyRotationInput, DisableKeyRotationOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  }
}
