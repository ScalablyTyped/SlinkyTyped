package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput
import typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyOutputMod.GenerateDataKeyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/GenerateDataKeyCommand", JSImport.Namespace)
@js.native
object generateDataKeyCommandMod extends js.Object {
  
  @js.native
  class GenerateDataKeyCommand protected () extends Command[
          InputTypesUnion, 
          GenerateDataKeyInput, 
          OutputTypesUnion, 
          GenerateDataKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GenerateDataKeyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
  }
}
