package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultOutputMod.RemoveTagsFromVaultOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeTagsFromVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/RemoveTagsFromVaultCommand", "RemoveTagsFromVaultCommand")
  @js.native
  class RemoveTagsFromVaultCommand protected () extends Command[
          InputTypesUnion, 
          RemoveTagsFromVaultInput, 
          OutputTypesUnion, 
          RemoveTagsFromVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: RemoveTagsFromVaultInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput] = js.native
  }
}
