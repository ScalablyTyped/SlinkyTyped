package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
import typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/MergePullRequestByFastForwardCommand", JSImport.Namespace)
@js.native
object mergePullRequestByFastForwardCommandMod extends js.Object {
  @js.native
  class MergePullRequestByFastForwardCommand protected () extends Command[
          InputTypesUnion, 
          MergePullRequestByFastForwardInput, 
          OutputTypesUnion, 
          MergePullRequestByFastForwardOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: MergePullRequestByFastForwardInput) = this()
    val middlewareStack: MiddlewareStack[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
  }
  
}

