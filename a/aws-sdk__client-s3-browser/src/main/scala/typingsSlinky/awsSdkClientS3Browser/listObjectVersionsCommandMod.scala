package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listObjectVersionsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/ListObjectVersionsCommand", "ListObjectVersionsCommand")
  @js.native
  class ListObjectVersionsCommand protected () extends Command[
          InputTypesUnion, 
          ListObjectVersionsInput, 
          OutputTypesUnion, 
          ListObjectVersionsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListObjectVersionsInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  }
}
