package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteCommentContentCommand", JSImport.Namespace)
@js.native
object deleteCommentContentCommandMod extends js.Object {
  @js.native
  class DeleteCommentContentCommand protected () extends Command[
          InputTypesUnion, 
          DeleteCommentContentInput, 
          OutputTypesUnion, 
          DeleteCommentContentOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteCommentContentInput) = this()
    val middlewareStack: MiddlewareStack[DeleteCommentContentInput, DeleteCommentContentOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
  }
  
}

