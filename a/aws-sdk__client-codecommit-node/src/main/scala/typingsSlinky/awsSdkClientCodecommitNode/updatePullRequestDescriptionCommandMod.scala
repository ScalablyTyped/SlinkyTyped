package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestDescriptionCommand", JSImport.Namespace)
@js.native
object updatePullRequestDescriptionCommandMod extends js.Object {
  @js.native
  class UpdatePullRequestDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdatePullRequestDescriptionInput, 
          OutputTypesUnion, 
          UpdatePullRequestDescriptionOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdatePullRequestDescriptionInput) = this()
    /* CompleteClass */
    override val input: UpdatePullRequestDescriptionInput = js.native
    val middlewareStack: MiddlewareStack[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
  }
  
}

