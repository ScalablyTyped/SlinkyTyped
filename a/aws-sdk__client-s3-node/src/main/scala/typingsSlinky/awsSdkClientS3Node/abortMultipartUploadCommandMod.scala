package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/AbortMultipartUploadCommand", JSImport.Namespace)
@js.native
object abortMultipartUploadCommandMod extends js.Object {
  
  @js.native
  class AbortMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          AbortMultipartUploadInput, 
          OutputTypesUnion, 
          AbortMultipartUploadOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: AbortMultipartUploadInput) = this()
    
    val middlewareStack: MiddlewareStack[AbortMultipartUploadInput, AbortMultipartUploadOutput, Readable] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
  }
}
