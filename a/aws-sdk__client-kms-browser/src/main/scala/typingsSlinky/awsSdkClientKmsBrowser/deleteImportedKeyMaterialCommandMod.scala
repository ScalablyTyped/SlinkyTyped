package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
import typingsSlinky.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialOutputMod.DeleteImportedKeyMaterialOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/DeleteImportedKeyMaterialCommand", JSImport.Namespace)
@js.native
object deleteImportedKeyMaterialCommandMod extends js.Object {
  @js.native
  class DeleteImportedKeyMaterialCommand protected () extends Command[
          InputTypesUnion, 
          DeleteImportedKeyMaterialInput, 
          OutputTypesUnion, 
          DeleteImportedKeyMaterialOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteImportedKeyMaterialInput) = this()
    /* CompleteClass */
    override val input: DeleteImportedKeyMaterialInput = js.native
    val middlewareStack: MiddlewareStack[
        DeleteImportedKeyMaterialInput, 
        DeleteImportedKeyMaterialOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
  }
  
}

