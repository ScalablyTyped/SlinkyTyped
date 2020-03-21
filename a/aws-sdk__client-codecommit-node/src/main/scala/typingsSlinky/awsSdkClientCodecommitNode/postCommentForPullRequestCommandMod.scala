package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForPullRequestCommand", JSImport.Namespace)
@js.native
object postCommentForPullRequestCommandMod extends js.Object {
  @js.native
  class PostCommentForPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentForPullRequestInput, 
          OutputTypesUnion, 
          PostCommentForPullRequestOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PostCommentForPullRequestInput) = this()
    /* CompleteClass */
    override val input: PostCommentForPullRequestInput = js.native
    val middlewareStack: MiddlewareStack[PostCommentForPullRequestInput, PostCommentForPullRequestOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
  }
  
}

