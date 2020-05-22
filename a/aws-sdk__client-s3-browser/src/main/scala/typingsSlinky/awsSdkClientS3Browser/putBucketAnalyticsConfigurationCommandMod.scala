package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketAnalyticsConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          PutBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketAnalyticsConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketAnalyticsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
  }
  
}

