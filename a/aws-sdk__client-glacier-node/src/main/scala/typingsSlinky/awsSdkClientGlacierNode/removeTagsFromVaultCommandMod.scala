package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultOutputMod.RemoveTagsFromVaultOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/RemoveTagsFromVaultCommand", JSImport.Namespace)
@js.native
object removeTagsFromVaultCommandMod extends js.Object {
  
  @js.native
  class RemoveTagsFromVaultCommand protected () extends Command[
          InputTypesUnion, 
          RemoveTagsFromVaultInput, 
          OutputTypesUnion, 
          RemoveTagsFromVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: RemoveTagsFromVaultInput) = this()
    
    val middlewareStack: MiddlewareStack[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput] = js.native
  }
}
