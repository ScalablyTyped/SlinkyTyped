package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketNotificationCommand", JSImport.Namespace)
@js.native
object getBucketNotificationCommandMod extends js.Object {
  
  @js.native
  class GetBucketNotificationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketNotificationInput, 
          OutputTypesUnion, 
          GetBucketNotificationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketNotificationInput) = this()
    
    val middlewareStack: MiddlewareStack[GetBucketNotificationInput, GetBucketNotificationOutput, Readable] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationInput, GetBucketNotificationOutput] = js.native
  }
}
