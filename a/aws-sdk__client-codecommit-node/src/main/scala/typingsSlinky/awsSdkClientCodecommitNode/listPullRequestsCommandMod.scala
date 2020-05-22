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
    /* CompleteClass */
    override val input: ListPullRequestsInput = js.native
    val middlewareStack: MiddlewareStack[ListPullRequestsInput, ListPullRequestsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
  }
  
}

