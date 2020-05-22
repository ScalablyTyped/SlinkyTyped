package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketCorsCommand", JSImport.Namespace)
@js.native
object putBucketCorsCommandMod extends js.Object {
  @js.native
  class PutBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketCorsInput, 
          OutputTypesUnion, 
          PutBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketCorsInput) = this()
    /* CompleteClass */
    override val input: PutBucketCorsInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketCorsInput, PutBucketCorsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
  }
  
}

