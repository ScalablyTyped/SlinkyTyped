package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesCreateKeyOutputMod.CreateKeyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CreateKeyCommand", JSImport.Namespace)
@js.native
object createKeyCommandMod extends js.Object {
  @js.native
  class CreateKeyCommand protected () extends Command[
          InputTypesUnion, 
          CreateKeyInput, 
          OutputTypesUnion, 
          CreateKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateKeyInput) = this()
    /* CompleteClass */
    override val input: CreateKeyInput = js.native
    val middlewareStack: MiddlewareStack[CreateKeyInput, CreateKeyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
  }
  
}

