package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketRequestPaymentCommand", JSImport.Namespace)
@js.native
object putBucketRequestPaymentCommandMod extends js.Object {
  
  @js.native
  class PutBucketRequestPaymentCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketRequestPaymentInput, 
          OutputTypesUnion, 
          PutBucketRequestPaymentOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketRequestPaymentInput) = this()
    
    val middlewareStack: MiddlewareStack[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
  }
}
