package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketNotificationConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketNotificationConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketNotificationConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketNotificationConfigurationInput, 
          OutputTypesUnion, 
          PutBucketNotificationConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketNotificationConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketNotificationConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        PutBucketNotificationConfigurationInput, 
        PutBucketNotificationConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
  }
  
}

