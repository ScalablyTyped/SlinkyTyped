package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput
import typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyOutputMod.DisableKeyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DisableKeyCommand", "DisableKeyCommand")
  @js.native
  class DisableKeyCommand protected () extends Command[
          InputTypesUnion, 
          DisableKeyInput, 
          OutputTypesUnion, 
          DisableKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DisableKeyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyInput, DisableKeyOutput] = js.native
  }
}
