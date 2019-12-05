package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobInputMod.InitiateJobInput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobOutputMod.InitiateJobOutput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateJobCommand", JSImport.Namespace)
@js.native
object commandsInitiateJobCommandMod extends js.Object {
  @js.native
  class InitiateJobCommand protected () extends Command[
          InputTypesUnion, 
          InitiateJobInput, 
          OutputTypesUnion, 
          InitiateJobOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: InitiateJobInput) = this()
    /* CompleteClass */
    override val input: InitiateJobInput = js.native
    val middlewareStack: MiddlewareStack[InitiateJobInput, InitiateJobOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
  }
  
}

