package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketVersioningCommand", JSImport.Namespace)
@js.native
object getBucketVersioningCommandMod extends js.Object {
  @js.native
  class GetBucketVersioningCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketVersioningInput, 
          OutputTypesUnion, 
          GetBucketVersioningOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketVersioningInput) = this()
    /* CompleteClass */
    override val input: GetBucketVersioningInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketVersioningInput, GetBucketVersioningOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
  }
  
}

