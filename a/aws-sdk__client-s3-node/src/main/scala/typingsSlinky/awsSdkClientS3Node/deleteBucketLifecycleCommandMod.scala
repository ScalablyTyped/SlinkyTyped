package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketLifecycleCommand", JSImport.Namespace)
@js.native
object deleteBucketLifecycleCommandMod extends js.Object {
  
  @js.native
  class DeleteBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketLifecycleInput, 
          OutputTypesUnion, 
          DeleteBucketLifecycleOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteBucketLifecycleInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
  }
}
