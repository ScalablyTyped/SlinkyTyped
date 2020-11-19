package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketMetricsConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketMetricsConfigurationCommandMod extends js.Object {
  
  @js.native
  class DeleteBucketMetricsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketMetricsConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
  }
}
