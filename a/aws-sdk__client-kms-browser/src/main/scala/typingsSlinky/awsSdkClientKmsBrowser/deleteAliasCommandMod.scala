package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput
import typingsSlinky.awsSdkClientKmsBrowser.typesDeleteAliasOutputMod.DeleteAliasOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteAliasCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DeleteAliasCommand", "DeleteAliasCommand")
  @js.native
  class DeleteAliasCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAliasInput, 
          OutputTypesUnion, 
          DeleteAliasOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DeleteAliasInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
  }
}
