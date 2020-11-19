package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketNotificationConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketNotificationConfigurationCommandMod extends js.Object {
  
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
  }
}
