package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketEncryptionCommand", JSImport.Namespace)
@js.native
object deleteBucketEncryptionCommandMod extends js.Object {
  
  @js.native
  class DeleteBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketEncryptionInput, 
          OutputTypesUnion, 
          DeleteBucketEncryptionOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketEncryptionInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketEncryptionInput, DeleteBucketEncryptionOutput] = js.native
  }
}
