package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/ListObjectVersionsCommand", JSImport.Namespace)
@js.native
object listObjectVersionsCommandMod extends js.Object {
  
  @js.native
  class ListObjectVersionsCommand protected () extends Command[
          InputTypesUnion, 
          ListObjectVersionsInput, 
          OutputTypesUnion, 
          ListObjectVersionsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListObjectVersionsInput) = this()
    
    val middlewareStack: MiddlewareStack[ListObjectVersionsInput, ListObjectVersionsOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  }
}
