package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectAclCommand", JSImport.Namespace)
@js.native
object getObjectAclCommandMod extends js.Object {
  @js.native
  class GetObjectAclCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectAclInput, 
          OutputTypesUnion, 
          GetObjectAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetObjectAclInput) = this()
    /* CompleteClass */
    override val input: GetObjectAclInput = js.native
    val middlewareStack: MiddlewareStack[GetObjectAclInput, GetObjectAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
  }
  
}

