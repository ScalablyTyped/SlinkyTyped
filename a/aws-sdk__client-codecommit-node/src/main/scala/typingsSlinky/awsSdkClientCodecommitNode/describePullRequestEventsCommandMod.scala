package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput
import typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DescribePullRequestEventsCommand", JSImport.Namespace)
@js.native
object describePullRequestEventsCommandMod extends js.Object {
  @js.native
  class DescribePullRequestEventsCommand protected () extends Command[
          InputTypesUnion, 
          DescribePullRequestEventsInput, 
          OutputTypesUnion, 
          DescribePullRequestEventsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribePullRequestEventsInput) = this()
    /* CompleteClass */
    override val input: DescribePullRequestEventsInput = js.native
    val middlewareStack: MiddlewareStack[DescribePullRequestEventsInput, DescribePullRequestEventsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
  }
  
}

