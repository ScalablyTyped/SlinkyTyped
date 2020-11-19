package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
import typingsSlinky.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialOutputMod.DeleteImportedKeyMaterialOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/DeleteImportedKeyMaterialCommand", JSImport.Namespace)
@js.native
object deleteImportedKeyMaterialCommandMod extends js.Object {
  
  @js.native
  class DeleteImportedKeyMaterialCommand protected () extends Command[
          InputTypesUnion, 
          DeleteImportedKeyMaterialInput, 
          OutputTypesUnion, 
          DeleteImportedKeyMaterialOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteImportedKeyMaterialInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
  }
}
