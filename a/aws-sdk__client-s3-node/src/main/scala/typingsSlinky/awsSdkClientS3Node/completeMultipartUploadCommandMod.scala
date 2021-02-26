package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completeMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/CompleteMultipartUploadCommand", "CompleteMultipartUploadCommand")
  @js.native
  class CompleteMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          CompleteMultipartUploadInput, 
          OutputTypesUnion, 
          CompleteMultipartUploadOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: CompleteMultipartUploadInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
  }
}
