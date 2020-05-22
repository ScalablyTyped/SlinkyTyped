package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketLocationCommand", JSImport.Namespace)
@js.native
object getBucketLocationCommandMod extends js.Object {
  @js.native
  class GetBucketLocationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLocationInput, 
          OutputTypesUnion, 
          GetBucketLocationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketLocationInput) = this()
    /* CompleteClass */
    override val input: GetBucketLocationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketLocationInput, GetBucketLocationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
  }
  
}

