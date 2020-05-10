package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetPullRequestCommand", JSImport.Namespace)
@js.native
object getPullRequestCommandMod extends js.Object {
  @js.native
  class GetPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          GetPullRequestInput, 
          OutputTypesUnion, 
          GetPullRequestOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetPullRequestInput) = this()
    val middlewareStack: MiddlewareStack[GetPullRequestInput, GetPullRequestOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
  }
  
}

