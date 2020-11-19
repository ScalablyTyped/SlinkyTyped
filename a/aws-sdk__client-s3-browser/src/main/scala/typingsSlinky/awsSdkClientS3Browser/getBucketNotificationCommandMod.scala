package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketNotificationCommand", JSImport.Namespace)
@js.native
object getBucketNotificationCommandMod extends js.Object {
  
  @js.native
  class GetBucketNotificationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketNotificationInput, 
          OutputTypesUnion, 
          GetBucketNotificationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketNotificationInput) = this()
    
    val middlewareStack: MiddlewareStack[GetBucketNotificationInput, GetBucketNotificationOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationInput, GetBucketNotificationOutput] = js.native
  }
}
