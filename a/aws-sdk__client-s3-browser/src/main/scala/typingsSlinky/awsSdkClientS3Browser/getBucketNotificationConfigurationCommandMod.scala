package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketNotificationConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketNotificationConfigurationCommandMod extends js.Object {
  
  @js.native
  class GetBucketNotificationConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketNotificationConfigurationInput, 
          OutputTypesUnion, 
          GetBucketNotificationConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketNotificationConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[
        GetBucketNotificationConfigurationInput, 
        GetBucketNotificationConfigurationOutput, 
        Blob
      ] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationConfigurationInput, GetBucketNotificationConfigurationOutput] = js.native
  }
}
