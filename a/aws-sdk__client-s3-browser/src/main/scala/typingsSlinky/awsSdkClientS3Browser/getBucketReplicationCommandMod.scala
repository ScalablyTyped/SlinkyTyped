package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketReplicationCommand", JSImport.Namespace)
@js.native
object getBucketReplicationCommandMod extends js.Object {
  @js.native
  class GetBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketReplicationInput, 
          OutputTypesUnion, 
          GetBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketReplicationInput) = this()
    /* CompleteClass */
    override val input: GetBucketReplicationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketReplicationInput, GetBucketReplicationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketReplicationInput, GetBucketReplicationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketReplicationInput, GetBucketReplicationOutput] = js.native
  }
  
}

