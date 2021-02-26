package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableKeyRotationCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DisableKeyRotationCommand", "DisableKeyRotationCommand")
  @js.native
  class DisableKeyRotationCommand protected () extends Command[
          InputTypesUnion, 
          DisableKeyRotationInput, 
          OutputTypesUnion, 
          DisableKeyRotationOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DisableKeyRotationInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  }
}
