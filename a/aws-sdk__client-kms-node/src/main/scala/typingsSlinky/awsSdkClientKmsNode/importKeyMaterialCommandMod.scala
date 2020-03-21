package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
import typingsSlinky.awsSdkClientKmsNode.typesImportKeyMaterialOutputMod.ImportKeyMaterialOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ImportKeyMaterialCommand", JSImport.Namespace)
@js.native
object importKeyMaterialCommandMod extends js.Object {
  @js.native
  class ImportKeyMaterialCommand protected () extends Command[
          InputTypesUnion, 
          ImportKeyMaterialInput, 
          OutputTypesUnion, 
          ImportKeyMaterialOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ImportKeyMaterialInput) = this()
    /* CompleteClass */
    override val input: ImportKeyMaterialInput = js.native
    val middlewareStack: MiddlewareStack[ImportKeyMaterialInput, ImportKeyMaterialOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
  }
  
}

