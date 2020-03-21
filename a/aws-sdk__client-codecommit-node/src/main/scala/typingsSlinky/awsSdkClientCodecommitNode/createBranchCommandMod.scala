package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
import typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateBranchCommand", JSImport.Namespace)
@js.native
object createBranchCommandMod extends js.Object {
  @js.native
  class CreateBranchCommand protected () extends Command[
          InputTypesUnion, 
          CreateBranchInput, 
          OutputTypesUnion, 
          CreateBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateBranchInput) = this()
    /* CompleteClass */
    override val input: CreateBranchInput = js.native
    val middlewareStack: MiddlewareStack[CreateBranchInput, CreateBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
  }
  
}

