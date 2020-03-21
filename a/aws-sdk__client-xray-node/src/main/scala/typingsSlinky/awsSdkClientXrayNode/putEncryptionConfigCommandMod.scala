package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigOutputMod.PutEncryptionConfigOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutEncryptionConfigCommand", JSImport.Namespace)
@js.native
object putEncryptionConfigCommandMod extends js.Object {
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
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
  }
  
}

