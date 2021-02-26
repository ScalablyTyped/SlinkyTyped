package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput
import typingsSlinky.awsSdkClientKmsBrowser.typesGenerateRandomOutputMod.GenerateRandomOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateRandomCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GenerateRandomCommand", "GenerateRandomCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
  }
}
