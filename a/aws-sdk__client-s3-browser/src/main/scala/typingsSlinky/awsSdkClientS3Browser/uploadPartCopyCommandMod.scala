package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput
import typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/UploadPartCopyCommand", JSImport.Namespace)
@js.native
object uploadPartCopyCommandMod extends js.Object {
  
  @js.native
  class UploadPartCopyCommand protected () extends Command[
          InputTypesUnion, 
          UploadPartCopyInput, 
          OutputTypesUnion, 
          UploadPartCopyOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: UploadPartCopyInput) = this()
    
    val middlewareStack: MiddlewareStack[UploadPartCopyInput, UploadPartCopyOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartCopyInput, UploadPartCopyOutput] = js.native
  }
}
