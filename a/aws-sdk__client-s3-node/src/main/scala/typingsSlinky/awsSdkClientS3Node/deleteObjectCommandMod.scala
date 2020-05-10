package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteObjectCommand", JSImport.Namespace)
@js.native
object deleteObjectCommandMod extends js.Object {
  @js.native
  class DeleteObjectCommand protected () extends Command[
          InputTypesUnion, 
          DeleteObjectInput, 
          OutputTypesUnion, 
          DeleteObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteObjectInput) = this()
    val middlewareStack: MiddlewareStack[DeleteObjectInput, DeleteObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectInput, DeleteObjectOutput] = js.native
  }
  
}

