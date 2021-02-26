package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput
import typingsSlinky.awsSdkClientKmsBrowser.typesUpdateAliasOutputMod.UpdateAliasOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateAliasCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/UpdateAliasCommand", "UpdateAliasCommand")
  @js.native
  class UpdateAliasCommand protected () extends Command[
          InputTypesUnion, 
          UpdateAliasInput, 
          OutputTypesUnion, 
          UpdateAliasOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: UpdateAliasInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
  }
}
