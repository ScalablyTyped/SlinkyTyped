package typingsSlinky.atAwsDashSdkClientDashXrayDashNode

import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesPutEncryptionConfigOutputMod.PutEncryptionConfigOutput
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutEncryptionConfigCommand", JSImport.Namespace)
@js.native
object commandsPutEncryptionConfigCommandMod extends js.Object {
  @js.native
  class PutEncryptionConfigCommand protected () extends Command[
          InputTypesUnion, 
          PutEncryptionConfigInput, 
          OutputTypesUnion, 
          PutEncryptionConfigOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutEncryptionConfigInput) = this()
    /* CompleteClass */
    override val input: PutEncryptionConfigInput = js.native
    val middlewareStack: MiddlewareStack[PutEncryptionConfigInput, PutEncryptionConfigOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
  }
  
}

