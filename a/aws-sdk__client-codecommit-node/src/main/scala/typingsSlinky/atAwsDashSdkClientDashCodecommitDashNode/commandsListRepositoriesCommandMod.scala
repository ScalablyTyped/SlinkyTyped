package typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode

import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesListRepositoriesInputMod.ListRepositoriesInput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListRepositoriesCommand", JSImport.Namespace)
@js.native
object commandsListRepositoriesCommandMod extends js.Object {
  @js.native
  class ListRepositoriesCommand protected () extends Command[
          InputTypesUnion, 
          ListRepositoriesInput, 
          OutputTypesUnion, 
          ListRepositoriesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListRepositoriesInput) = this()
    /* CompleteClass */
    override val input: ListRepositoriesInput = js.native
    val middlewareStack: MiddlewareStack[ListRepositoriesInput, ListRepositoriesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
  }
  
}

