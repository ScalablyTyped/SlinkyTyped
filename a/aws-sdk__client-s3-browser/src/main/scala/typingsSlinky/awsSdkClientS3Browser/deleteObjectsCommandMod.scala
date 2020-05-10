package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput
import typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/DeleteObjectsCommand", JSImport.Namespace)
@js.native
object deleteObjectsCommandMod extends js.Object {
  @js.native
  class DeleteObjectsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteObjectsInput, 
          OutputTypesUnion, 
          DeleteObjectsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteObjectsInput) = this()
    val middlewareStack: MiddlewareStack[DeleteObjectsInput, DeleteObjectsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectsInput, DeleteObjectsOutput] = js.native
  }
  
}

