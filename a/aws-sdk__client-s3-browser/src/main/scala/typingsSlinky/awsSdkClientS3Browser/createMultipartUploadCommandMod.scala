package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
import typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/CreateMultipartUploadCommand", "CreateMultipartUploadCommand")
  @js.native
  class CreateMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          CreateMultipartUploadInput, 
          OutputTypesUnion, 
          CreateMultipartUploadOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: CreateMultipartUploadInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[CreateMultipartUploadInput, CreateMultipartUploadOutput] = js.native
  }
}
