package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
import typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketAnalyticsConfigurationCommandMod extends js.Object {
  
  @js.native
  class DeleteBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBucketAnalyticsConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[
        DeleteBucketAnalyticsConfigurationInput, 
        DeleteBucketAnalyticsConfigurationOutput, 
        Blob
      ] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketAnalyticsConfigurationInput, DeleteBucketAnalyticsConfigurationOutput] = js.native
  }
}
