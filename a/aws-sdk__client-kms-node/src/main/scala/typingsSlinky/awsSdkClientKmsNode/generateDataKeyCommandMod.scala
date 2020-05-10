package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyOutputMod.GenerateDataKeyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GenerateDataKeyCommand", JSImport.Namespace)
@js.native
object generateDataKeyCommandMod extends js.Object {
  @js.native
  class GenerateDataKeyCommand protected () extends Command[
          InputTypesUnion, 
          GenerateDataKeyInput, 
          OutputTypesUnion, 
          GenerateDataKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GenerateDataKeyInput) = this()
    val middlewareStack: MiddlewareStack[GenerateDataKeyInput, GenerateDataKeyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
  }
  
}

