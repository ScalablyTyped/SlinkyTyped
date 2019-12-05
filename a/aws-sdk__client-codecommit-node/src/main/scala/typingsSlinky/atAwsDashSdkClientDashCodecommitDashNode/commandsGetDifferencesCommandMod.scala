package typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode

import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesInputMod.GetDifferencesInput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesOutputMod.GetDifferencesOutput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetDifferencesCommand", JSImport.Namespace)
@js.native
object commandsGetDifferencesCommandMod extends js.Object {
  @js.native
  class GetDifferencesCommand protected () extends Command[
          InputTypesUnion, 
          GetDifferencesInput, 
          OutputTypesUnion, 
          GetDifferencesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetDifferencesInput) = this()
    /* CompleteClass */
    override val input: GetDifferencesInput = js.native
    val middlewareStack: MiddlewareStack[GetDifferencesInput, GetDifferencesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
  }
  
}

