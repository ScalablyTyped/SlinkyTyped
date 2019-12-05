package typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode

import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsInputMod.ListPullRequestsInput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListPullRequestsCommand", JSImport.Namespace)
@js.native
object commandsListPullRequestsCommandMod extends js.Object {
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
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
  }
  
}

