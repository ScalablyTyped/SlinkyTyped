package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/AddTagsToVaultCommand", JSImport.Namespace)
@js.native
object addTagsToVaultCommandMod extends js.Object {
  
  @js.native
  class AddTagsToVaultCommand protected () extends Command[
          InputTypesUnion, 
          AddTagsToVaultInput, 
          OutputTypesUnion, 
          AddTagsToVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: AddTagsToVaultInput) = this()
    
    val middlewareStack: MiddlewareStack[AddTagsToVaultInput, AddTagsToVaultOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
  }
}
