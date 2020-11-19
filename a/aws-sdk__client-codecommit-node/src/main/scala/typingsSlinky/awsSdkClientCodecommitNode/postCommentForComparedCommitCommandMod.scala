package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
import typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForComparedCommitCommand", JSImport.Namespace)
@js.native
object postCommentForComparedCommitCommandMod extends js.Object {
  
  @js.native
  class PostCommentForComparedCommitCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentForComparedCommitInput, 
          OutputTypesUnion, 
          PostCommentForComparedCommitOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PostCommentForComparedCommitInput) = this()
    
    val middlewareStack: MiddlewareStack[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
  }
}
