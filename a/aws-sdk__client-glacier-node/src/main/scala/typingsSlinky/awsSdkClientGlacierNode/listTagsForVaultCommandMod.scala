package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/ListTagsForVaultCommand", JSImport.Namespace)
@js.native
object listTagsForVaultCommandMod extends js.Object {
  
  @js.native
  class ListTagsForVaultCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsForVaultInput, 
          OutputTypesUnion, 
          ListTagsForVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListTagsForVaultInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
  }
}
