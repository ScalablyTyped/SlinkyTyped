package typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode

import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobInputMod.GetBlobInput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobOutputMod.GetBlobOutput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBlobCommand", JSImport.Namespace)
@js.native
object commandsGetBlobCommandMod extends js.Object {
  @js.native
  class GetBlobCommand protected () extends Command[
          InputTypesUnion, 
          GetBlobInput, 
          OutputTypesUnion, 
          GetBlobOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBlobInput) = this()
    /* CompleteClass */
    override val input: GetBlobInput = js.native
    val middlewareStack: MiddlewareStack[GetBlobInput, GetBlobOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
  }
  
}

