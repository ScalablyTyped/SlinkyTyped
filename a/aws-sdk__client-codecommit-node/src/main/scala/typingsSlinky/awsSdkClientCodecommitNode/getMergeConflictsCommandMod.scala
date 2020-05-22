package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetMergeConflictsCommand", JSImport.Namespace)
@js.native
object getMergeConflictsCommandMod extends js.Object {
  @js.native
  class GetMergeConflictsCommand protected () extends Command[
          InputTypesUnion, 
          GetMergeConflictsInput, 
          OutputTypesUnion, 
          GetMergeConflictsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetMergeConflictsInput) = this()
    /* CompleteClass */
    override val input: GetMergeConflictsInput = js.native
    val middlewareStack: MiddlewareStack[GetMergeConflictsInput, GetMergeConflictsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
  }
  
}

