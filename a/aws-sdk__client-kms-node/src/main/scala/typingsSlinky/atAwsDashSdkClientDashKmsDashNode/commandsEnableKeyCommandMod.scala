package typingsSlinky.atAwsDashSdkClientDashKmsDashNode

import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyInputMod.EnableKeyInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyOutputMod.EnableKeyOutput
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/EnableKeyCommand", JSImport.Namespace)
@js.native
object commandsEnableKeyCommandMod extends js.Object {
  @js.native
  class EnableKeyCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyInput, 
          OutputTypesUnion, 
          EnableKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: EnableKeyInput) = this()
    /* CompleteClass */
    override val input: EnableKeyInput = js.native
    val middlewareStack: MiddlewareStack[EnableKeyInput, EnableKeyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
  }
  
}

