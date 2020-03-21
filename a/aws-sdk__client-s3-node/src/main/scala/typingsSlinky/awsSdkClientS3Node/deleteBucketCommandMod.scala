package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketCommand", JSImport.Namespace)
@js.native
object deleteBucketCommandMod extends js.Object {
  @js.native
  class DeleteBucketCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketInput, 
          OutputTypesUnion, 
          DeleteBucketOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBucketInput, DeleteBucketOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInput, DeleteBucketOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInput, DeleteBucketOutput] = js.native
  }
  
}

