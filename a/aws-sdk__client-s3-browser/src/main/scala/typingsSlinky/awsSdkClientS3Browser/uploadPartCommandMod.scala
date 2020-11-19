package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typingsSlinky.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/UploadPartCommand", JSImport.Namespace)
@js.native
object uploadPartCommandMod extends js.Object {
  
  @js.native
  class UploadPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadPartInput[Blob], 
          OutputTypesUnion, 
          UploadPartOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: UploadPartInput[Blob]) = this()
    
    val middlewareStack: MiddlewareStack[UploadPartInput[Blob], UploadPartOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Blob], UploadPartOutput] = js.native
  }
}
