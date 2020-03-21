package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput
import typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/UploadPartCopyCommand", JSImport.Namespace)
@js.native
object uploadPartCopyCommandMod extends js.Object {
  @js.native
  class UploadPartCopyCommand protected () extends Command[
          InputTypesUnion, 
          UploadPartCopyInput, 
          OutputTypesUnion, 
          UploadPartCopyOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: UploadPartCopyInput) = this()
    /* CompleteClass */
    override val input: UploadPartCopyInput = js.native
    val middlewareStack: MiddlewareStack[UploadPartCopyInput, UploadPartCopyOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartCopyInput, UploadPartCopyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartCopyInput, UploadPartCopyOutput] = js.native
  }
  
}

