package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput
import typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreatePullRequestCommand", JSImport.Namespace)
@js.native
object createPullRequestCommandMod extends js.Object {
  @js.native
  class CreatePullRequestCommand protected () extends Command[
          InputTypesUnion, 
          CreatePullRequestInput, 
          OutputTypesUnion, 
          CreatePullRequestOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreatePullRequestInput) = this()
    val middlewareStack: MiddlewareStack[CreatePullRequestInput, CreatePullRequestOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreatePullRequestInput, CreatePullRequestOutput] = js.native
  }
  
}

