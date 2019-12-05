package typingsSlinky.atAwsDashSdkClientDashKmsDashNode

import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesGetKeyPolicyOutputMod.GetKeyPolicyOutput
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GetKeyPolicyCommand", JSImport.Namespace)
@js.native
object commandsGetKeyPolicyCommandMod extends js.Object {
  @js.native
  class GetKeyPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetKeyPolicyInput, 
          OutputTypesUnion, 
          GetKeyPolicyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetKeyPolicyInput) = this()
    /* CompleteClass */
    override val input: GetKeyPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetKeyPolicyInput, GetKeyPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
  }
  
}

