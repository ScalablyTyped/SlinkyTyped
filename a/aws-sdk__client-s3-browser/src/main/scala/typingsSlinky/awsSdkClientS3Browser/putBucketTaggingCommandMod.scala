package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketTaggingCommand", JSImport.Namespace)
@js.native
object putBucketTaggingCommandMod extends js.Object {
  @js.native
  class PutBucketTaggingCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketTaggingInput, 
          OutputTypesUnion, 
          PutBucketTaggingOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketTaggingInput) = this()
    /* CompleteClass */
    override val input: PutBucketTaggingInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketTaggingInput, PutBucketTaggingOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
  }
  
}

