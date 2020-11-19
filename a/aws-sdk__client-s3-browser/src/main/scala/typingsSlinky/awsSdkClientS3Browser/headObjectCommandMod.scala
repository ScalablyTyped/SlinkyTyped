package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput
import typingsSlinky.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/HeadObjectCommand", JSImport.Namespace)
@js.native
object headObjectCommandMod extends js.Object {
  
  @js.native
  class HeadObjectCommand protected () extends Command[
          InputTypesUnion, 
          HeadObjectInput, 
          OutputTypesUnion, 
          HeadObjectOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: HeadObjectInput) = this()
    
    val middlewareStack: MiddlewareStack[HeadObjectInput, HeadObjectOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[HeadObjectInput, HeadObjectOutput] = js.native
  }
}
