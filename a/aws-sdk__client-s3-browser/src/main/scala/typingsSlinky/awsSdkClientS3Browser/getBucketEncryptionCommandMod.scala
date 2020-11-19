package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketEncryptionCommand", JSImport.Namespace)
@js.native
object getBucketEncryptionCommandMod extends js.Object {
  
  @js.native
  class GetBucketEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketEncryptionInput, 
          OutputTypesUnion, 
          GetBucketEncryptionOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketEncryptionInput) = this()
    
    val middlewareStack: MiddlewareStack[GetBucketEncryptionInput, GetBucketEncryptionOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
  }
}
