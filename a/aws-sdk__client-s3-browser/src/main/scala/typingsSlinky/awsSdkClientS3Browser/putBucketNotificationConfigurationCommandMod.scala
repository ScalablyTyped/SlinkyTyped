package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketNotificationConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketNotificationConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketNotificationConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketNotificationConfigurationInput, 
          OutputTypesUnion, 
          PutBucketNotificationConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketNotificationConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketNotificationConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        PutBucketNotificationConfigurationInput, 
        PutBucketNotificationConfigurationOutput, 
        Blob
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
  }
  
}

