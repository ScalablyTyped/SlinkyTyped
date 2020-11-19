package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentsForPullRequestCommand", JSImport.Namespace)
@js.native
object getCommentsForPullRequestCommandMod extends js.Object {
  
  @js.native
  class GetCommentsForPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          GetCommentsForPullRequestInput, 
          OutputTypesUnion, 
          GetCommentsForPullRequestOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetCommentsForPullRequestInput) = this()
    
    val middlewareStack: MiddlewareStack[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput] = js.native
  }
}
