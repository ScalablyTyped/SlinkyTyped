package typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode

import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetMergeConflictsCommand", JSImport.Namespace)
@js.native
object commandsGetMergeConflictsCommandMod extends js.Object {
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
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
  }
  
}

