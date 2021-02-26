package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postCommentForPullRequestCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForPullRequestCommand", "PostCommentForPullRequestCommand")
  @js.native
  class PostCommentForPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentForPullRequestInput, 
          OutputTypesUnion, 
          PostCommentForPullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PostCommentForPullRequestInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForPullRequestInput, PostCommentForPullRequestOutput] = js.native
  }
}
