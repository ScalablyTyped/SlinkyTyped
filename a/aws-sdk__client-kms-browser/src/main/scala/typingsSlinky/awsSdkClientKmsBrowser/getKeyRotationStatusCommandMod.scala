package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
import typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyRotationStatusOutputMod.GetKeyRotationStatusOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/GetKeyRotationStatusCommand", JSImport.Namespace)
@js.native
object getKeyRotationStatusCommandMod extends js.Object {
  
  @js.native
  class GetKeyRotationStatusCommand protected () extends Command[
          InputTypesUnion, 
          GetKeyRotationStatusInput, 
          OutputTypesUnion, 
          GetKeyRotationStatusOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetKeyRotationStatusInput) = this()
    
    val middlewareStack: MiddlewareStack[GetKeyRotationStatusInput, GetKeyRotationStatusOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
  }
}
