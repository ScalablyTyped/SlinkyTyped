package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketNotificationConfigurationCommand", JSImport.Namespace)
@js.native
object commandsGetBucketNotificationConfigurationCommandMod extends js.Object {
  @js.native
  class GetBucketNotificationConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketNotificationConfigurationInput, 
          OutputTypesUnion, 
          GetBucketNotificationConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketNotificationConfigurationInput) = this()
    /* CompleteClass */
    override val input: GetBucketNotificationConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        GetBucketNotificationConfigurationInput, 
        GetBucketNotificationConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationConfigurationInput, GetBucketNotificationConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationConfigurationInput, GetBucketNotificationConfigurationOutput] = js.native
  }
  
}

