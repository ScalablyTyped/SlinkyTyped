package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextOutputMod.GenerateDataKeyWithoutPlaintextOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/GenerateDataKeyWithoutPlaintextCommand", JSImport.Namespace)
@js.native
object generateDataKeyWithoutPlaintextCommandMod extends js.Object {
  
  @js.native
  class GenerateDataKeyWithoutPlaintextCommand protected () extends Command[
          InputTypesUnion, 
          GenerateDataKeyWithoutPlaintextInput, 
          OutputTypesUnion, 
          GenerateDataKeyWithoutPlaintextOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GenerateDataKeyWithoutPlaintextInput) = this()
    
    val middlewareStack: MiddlewareStack[
        GenerateDataKeyWithoutPlaintextInput, 
        GenerateDataKeyWithoutPlaintextOutput, 
        Readable
      ] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
  }
}
