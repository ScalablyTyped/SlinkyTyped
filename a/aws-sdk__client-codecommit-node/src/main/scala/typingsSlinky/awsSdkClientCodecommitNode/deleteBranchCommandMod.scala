package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteBranchCommand", JSImport.Namespace)
@js.native
object deleteBranchCommandMod extends js.Object {
  @js.native
  class DeleteBranchCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBranchInput, 
          OutputTypesUnion, 
          DeleteBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBranchInput) = this()
    /* CompleteClass */
    override val input: DeleteBranchInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBranchInput, DeleteBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
  }
  
}

