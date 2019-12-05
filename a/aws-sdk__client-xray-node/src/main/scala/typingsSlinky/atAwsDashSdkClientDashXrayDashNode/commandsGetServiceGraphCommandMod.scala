package typingsSlinky.atAwsDashSdkClientDashXrayDashNode

import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetServiceGraphCommand", JSImport.Namespace)
@js.native
object commandsGetServiceGraphCommandMod extends js.Object {
  @js.native
  class GetServiceGraphCommand protected () extends Command[
          InputTypesUnion, 
          GetServiceGraphInput, 
          OutputTypesUnion, 
          GetServiceGraphOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetServiceGraphInput) = this()
    /* CompleteClass */
    override val input: GetServiceGraphInput = js.native
    val middlewareStack: MiddlewareStack[GetServiceGraphInput, GetServiceGraphOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
  }
  
}

