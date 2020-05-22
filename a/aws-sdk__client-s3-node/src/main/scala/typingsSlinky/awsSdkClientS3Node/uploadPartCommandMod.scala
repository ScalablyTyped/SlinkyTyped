package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typingsSlinky.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/UploadPartCommand", JSImport.Namespace)
@js.native
object uploadPartCommandMod extends js.Object {
  @js.native
  class UploadPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadPartInput[Readable], 
          OutputTypesUnion, 
          UploadPartOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: UploadPartInput[Readable]) = this()
    /* CompleteClass */
    override val input: UploadPartInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[UploadPartInput[Readable], UploadPartOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Readable], UploadPartOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Readable], UploadPartOutput] = js.native
  }
  
}

