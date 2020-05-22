package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectAclCommand", JSImport.Namespace)
@js.native
object putObjectAclCommandMod extends js.Object {
  @js.native
  class PutObjectAclCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectAclInput, 
          OutputTypesUnion, 
          PutObjectAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectAclInput) = this()
    /* CompleteClass */
    override val input: PutObjectAclInput = js.native
    val middlewareStack: MiddlewareStack[PutObjectAclInput, PutObjectAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectAclInput, PutObjectAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectAclInput, PutObjectAclOutput] = js.native
  }
  
}

