package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput
import typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteObjectCommand", JSImport.Namespace)
@js.native
object deleteObjectCommandMod extends js.Object {
  
  @js.native
  class DeleteObjectCommand protected () extends Command[
          InputTypesUnion, 
          DeleteObjectInput, 
          OutputTypesUnion, 
          DeleteObjectOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteObjectInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteObjectInput, DeleteObjectOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectInput, DeleteObjectOutput] = js.native
  }
}
