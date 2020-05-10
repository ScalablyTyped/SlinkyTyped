package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketRequestPaymentCommand", JSImport.Namespace)
@js.native
object putBucketRequestPaymentCommandMod extends js.Object {
  @js.native
  class PutBucketRequestPaymentCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketRequestPaymentInput, 
          OutputTypesUnion, 
          PutBucketRequestPaymentOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketRequestPaymentInput) = this()
    val middlewareStack: MiddlewareStack[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
  }
  
}

