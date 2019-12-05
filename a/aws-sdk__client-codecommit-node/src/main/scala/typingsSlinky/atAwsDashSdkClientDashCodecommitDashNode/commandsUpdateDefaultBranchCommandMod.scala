package typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode

import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateDefaultBranchCommand", JSImport.Namespace)
@js.native
object commandsUpdateDefaultBranchCommandMod extends js.Object {
  @js.native
  class UpdateDefaultBranchCommand protected () extends Command[
          InputTypesUnion, 
          UpdateDefaultBranchInput, 
          OutputTypesUnion, 
          UpdateDefaultBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateDefaultBranchInput) = this()
    /* CompleteClass */
    override val input: UpdateDefaultBranchInput = js.native
    val middlewareStack: MiddlewareStack[UpdateDefaultBranchInput, UpdateDefaultBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
  }
  
}

