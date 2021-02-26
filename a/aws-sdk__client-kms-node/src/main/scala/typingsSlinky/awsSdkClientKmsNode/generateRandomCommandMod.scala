package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput
import typingsSlinky.awsSdkClientKmsNode.typesGenerateRandomOutputMod.GenerateRandomOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateRandomCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GenerateRandomCommand", "GenerateRandomCommand")
  @js.native
  class GenerateRandomCommand protected () extends Command[
          InputTypesUnion, 
          GenerateRandomInput, 
          OutputTypesUnion, 
          GenerateRandomOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GenerateRandomInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
  }
}
