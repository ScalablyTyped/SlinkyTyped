package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketRequestPaymentCommand", JSImport.Namespace)
@js.native
object getBucketRequestPaymentCommandMod extends js.Object {
  @js.native
  class GetBucketRequestPaymentCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketRequestPaymentInput, 
          OutputTypesUnion, 
          GetBucketRequestPaymentOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketRequestPaymentInput) = this()
    /* CompleteClass */
    override val input: GetBucketRequestPaymentInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
  }
  
}

