package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketCorsCommand", JSImport.Namespace)
@js.native
object deleteBucketCorsCommandMod extends js.Object {
  
  @js.native
  class DeleteBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketCorsInput, 
          OutputTypesUnion, 
          DeleteBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketCorsInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteBucketCorsInput, DeleteBucketCorsOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketCorsInput, DeleteBucketCorsOutput] = js.native
  }
}
