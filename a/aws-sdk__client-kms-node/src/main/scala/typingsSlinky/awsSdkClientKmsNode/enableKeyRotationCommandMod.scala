package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
import typingsSlinky.awsSdkClientKmsNode.typesEnableKeyRotationOutputMod.EnableKeyRotationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/EnableKeyRotationCommand", JSImport.Namespace)
@js.native
object enableKeyRotationCommandMod extends js.Object {
  @js.native
  class EnableKeyRotationCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyRotationInput, 
          OutputTypesUnion, 
          EnableKeyRotationOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: EnableKeyRotationInput) = this()
    /* CompleteClass */
    override val input: EnableKeyRotationInput = js.native
    val middlewareStack: MiddlewareStack[EnableKeyRotationInput, EnableKeyRotationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
  }
  
}

