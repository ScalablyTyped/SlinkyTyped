package typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode

import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileInputMod.GetFileInput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileOutputMod.GetFileOutput
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFileCommand", JSImport.Namespace)
@js.native
object commandsGetFileCommandMod extends js.Object {
  @js.native
  class GetFileCommand protected () extends Command[
          InputTypesUnion, 
          GetFileInput, 
          OutputTypesUnion, 
          GetFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFileInput) = this()
    /* CompleteClass */
    override val input: GetFileInput = js.native
    val middlewareStack: MiddlewareStack[GetFileInput, GetFileOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
  }
  
}

