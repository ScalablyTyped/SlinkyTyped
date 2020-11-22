package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput
import typingsSlinky.awsSdkClientKmsBrowser.typesListResourceTagsOutputMod.ListResourceTagsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/ListResourceTagsCommand", JSImport.Namespace)
@js.native
object listResourceTagsCommandMod extends js.Object {
  
  @js.native
  class ListResourceTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListResourceTagsInput, 
          OutputTypesUnion, 
          ListResourceTagsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListResourceTagsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
  }
}
