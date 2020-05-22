package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateCommentCommand", JSImport.Namespace)
@js.native
object updateCommentCommandMod extends js.Object {
  @js.native
  class UpdateCommentCommand protected () extends Command[
          InputTypesUnion, 
          UpdateCommentInput, 
          OutputTypesUnion, 
          UpdateCommentOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateCommentInput) = this()
    /* CompleteClass */
    override val input: UpdateCommentInput = js.native
    val middlewareStack: MiddlewareStack[UpdateCommentInput, UpdateCommentOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
  }
  
}

