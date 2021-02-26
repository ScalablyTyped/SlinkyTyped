package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postCommentReplyCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentReplyCommand", "PostCommentReplyCommand")
  @js.native
  class PostCommentReplyCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentReplyInput, 
          OutputTypesUnion, 
          PostCommentReplyOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PostCommentReplyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
  }
}
