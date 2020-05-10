package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typingsSlinky.awsSdkClientKmsNode.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DisableKeyRotationCommand", JSImport.Namespace)
@js.native
object disableKeyRotationCommandMod extends js.Object {
  @js.native
  class DisableKeyRotationCommand protected () extends Command[
          InputTypesUnion, 
          DisableKeyRotationInput, 
          OutputTypesUnion, 
          DisableKeyRotationOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DisableKeyRotationInput) = this()
    val middlewareStack: MiddlewareStack[DisableKeyRotationInput, DisableKeyRotationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  }
  
}

