package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentsForComparedCommitCommand", JSImport.Namespace)
@js.native
object getCommentsForComparedCommitCommandMod extends js.Object {
  @js.native
  class GetCommentsForComparedCommitCommand protected () extends Command[
          InputTypesUnion, 
          GetCommentsForComparedCommitInput, 
          OutputTypesUnion, 
          GetCommentsForComparedCommitOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetCommentsForComparedCommitInput) = this()
    /* CompleteClass */
    override val input: GetCommentsForComparedCommitInput = js.native
    val middlewareStack: MiddlewareStack[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
  }
  
}

