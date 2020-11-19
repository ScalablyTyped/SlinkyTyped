package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
import typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/ListBucketAnalyticsConfigurationsCommand", JSImport.Namespace)
@js.native
object listBucketAnalyticsConfigurationsCommandMod extends js.Object {
  
  @js.native
  class ListBucketAnalyticsConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketAnalyticsConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketAnalyticsConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListBucketAnalyticsConfigurationsInput) = this()
    
    val middlewareStack: MiddlewareStack[
        ListBucketAnalyticsConfigurationsInput, 
        ListBucketAnalyticsConfigurationsOutput, 
        Blob
      ] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
  }
}
