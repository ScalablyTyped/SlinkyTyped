package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typingsSlinky.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putObjectCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutObjectCommand", "PutObjectCommand")
  @js.native
  class PutObjectCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectInput[Blob], 
          OutputTypesUnion, 
          PutObjectOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutObjectInput[Blob]) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Blob], PutObjectOutput] = js.native
  }
}
