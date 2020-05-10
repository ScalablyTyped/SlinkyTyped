package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketCorsCommand", JSImport.Namespace)
@js.native
object getBucketCorsCommandMod extends js.Object {
  @js.native
  class GetBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketCorsInput, 
          OutputTypesUnion, 
          GetBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketCorsInput) = this()
    val middlewareStack: MiddlewareStack[GetBucketCorsInput, GetBucketCorsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
  }
  
}

