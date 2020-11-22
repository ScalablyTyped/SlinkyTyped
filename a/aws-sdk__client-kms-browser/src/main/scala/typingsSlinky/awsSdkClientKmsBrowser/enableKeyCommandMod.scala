package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput
import typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyOutputMod.EnableKeyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/EnableKeyCommand", JSImport.Namespace)
@js.native
object enableKeyCommandMod extends js.Object {
  
  @js.native
  class EnableKeyCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyInput, 
          OutputTypesUnion, 
          EnableKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: EnableKeyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
  }
}
