package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput
import typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetObjectAclCommand", JSImport.Namespace)
@js.native
object getObjectAclCommandMod extends js.Object {
  @js.native
  class GetObjectAclCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectAclInput, 
          OutputTypesUnion, 
          GetObjectAclOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetObjectAclInput) = this()
    /* CompleteClass */
    override val input: GetObjectAclInput = js.native
    val middlewareStack: MiddlewareStack[GetObjectAclInput, GetObjectAclOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
  }
  
}

