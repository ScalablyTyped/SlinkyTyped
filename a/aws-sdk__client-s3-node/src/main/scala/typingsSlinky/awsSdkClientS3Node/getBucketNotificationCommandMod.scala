package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketNotificationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketNotificationCommand", "GetBucketNotificationCommand")
  @js.native
  class GetBucketNotificationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketNotificationInput, 
          OutputTypesUnion, 
          GetBucketNotificationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketNotificationInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationInput, GetBucketNotificationOutput] = js.native
  }
}
