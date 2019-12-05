package typingsSlinky.atAwsDashSdkClientDashKmsDashNode

import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListKeyPoliciesCommand", JSImport.Namespace)
@js.native
object commandsListKeyPoliciesCommandMod extends js.Object {
  @js.native
  class ListKeyPoliciesCommand protected () extends Command[
          InputTypesUnion, 
          ListKeyPoliciesInput, 
          OutputTypesUnion, 
          ListKeyPoliciesOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListKeyPoliciesInput) = this()
    /* CompleteClass */
    override val input: ListKeyPoliciesInput = js.native
    val middlewareStack: MiddlewareStack[ListKeyPoliciesInput, ListKeyPoliciesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  }
  
}

