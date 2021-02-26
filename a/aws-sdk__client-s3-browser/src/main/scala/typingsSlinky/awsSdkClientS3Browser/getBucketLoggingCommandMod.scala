package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketLoggingCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLoggingCommand", "GetBucketLoggingCommand")
  @js.native
  class GetBucketLoggingCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLoggingInput, 
          OutputTypesUnion, 
          GetBucketLoggingOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketLoggingInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLoggingInput, GetBucketLoggingOutput] = js.native
  }
}
