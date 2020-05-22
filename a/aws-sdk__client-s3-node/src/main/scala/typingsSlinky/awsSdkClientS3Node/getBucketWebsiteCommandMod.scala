package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketWebsiteCommand", JSImport.Namespace)
@js.native
object getBucketWebsiteCommandMod extends js.Object {
  @js.native
  class GetBucketWebsiteCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketWebsiteInput, 
          OutputTypesUnion, 
          GetBucketWebsiteOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketWebsiteInput) = this()
    /* CompleteClass */
    override val input: GetBucketWebsiteInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketWebsiteInput, GetBucketWebsiteOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketWebsiteInput, GetBucketWebsiteOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketWebsiteInput, GetBucketWebsiteOutput] = js.native
  }
  
}

