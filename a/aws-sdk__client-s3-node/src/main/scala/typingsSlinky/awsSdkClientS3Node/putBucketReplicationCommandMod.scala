package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketReplicationCommand", JSImport.Namespace)
@js.native
object putBucketReplicationCommandMod extends js.Object {
  @js.native
  class PutBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketReplicationInput, 
          OutputTypesUnion, 
          PutBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketReplicationInput) = this()
    /* CompleteClass */
    override val input: PutBucketReplicationInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketReplicationInput, PutBucketReplicationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
  }
  
}

