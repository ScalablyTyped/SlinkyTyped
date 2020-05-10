package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput
import typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListPullRequestsCommand", JSImport.Namespace)
@js.native
object listPullRequestsCommandMod extends js.Object {
  @js.native
  class ListPullRequestsCommand protected () extends Command[
          InputTypesUnion, 
          ListPullRequestsInput, 
          OutputTypesUnion, 
          ListPullRequestsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListPullRequestsInput) = this()
    val middlewareStack: MiddlewareStack[ListPullRequestsInput, ListPullRequestsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
  }
  
}

