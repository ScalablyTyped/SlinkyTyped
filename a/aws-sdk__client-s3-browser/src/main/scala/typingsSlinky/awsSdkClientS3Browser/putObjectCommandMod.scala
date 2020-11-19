package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typingsSlinky.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/PutObjectCommand", JSImport.Namespace)
@js.native
object putObjectCommandMod extends js.Object {
  
  @js.native
  class PutObjectCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectInput[Blob], 
          OutputTypesUnion, 
          PutObjectOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutObjectInput[Blob]) = this()
    
    val middlewareStack: MiddlewareStack[PutObjectInput[Blob], PutObjectOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Blob], PutObjectOutput] = js.native
  }
}
