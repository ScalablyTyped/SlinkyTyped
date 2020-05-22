package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketEncryptionCommand", JSImport.Namespace)
@js.native
object putBucketEncryptionCommandMod extends js.Object {
  @js.native
  class PutBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketEncryptionInput, 
          OutputTypesUnion, 
          PutBucketEncryptionOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketEncryptionInput) = this()
    /* CompleteClass */
    override val input: PutBucketEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketEncryptionInput, PutBucketEncryptionOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketEncryptionInput, PutBucketEncryptionOutput] = js.native
  }
  
}

