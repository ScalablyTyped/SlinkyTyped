package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
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
          GlacierResolvedConfiguration
        ] {
    def this(input: AddTagsToVaultInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
  }
}
