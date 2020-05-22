package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput
import typingsSlinky.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/HeadBucketCommand", JSImport.Namespace)
@js.native
object headBucketCommandMod extends js.Object {
  @js.native
  class HeadBucketCommand protected () extends Command[
          InputTypesUnion, 
          HeadBucketInput, 
          OutputTypesUnion, 
          HeadBucketOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: HeadBucketInput) = this()
    /* CompleteClass */
    override val input: HeadBucketInput = js.native
    val middlewareStack: MiddlewareStack[HeadBucketInput, HeadBucketOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[HeadBucketInput, HeadBucketOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[HeadBucketInput, HeadBucketOutput] = js.native
  }
  
}

