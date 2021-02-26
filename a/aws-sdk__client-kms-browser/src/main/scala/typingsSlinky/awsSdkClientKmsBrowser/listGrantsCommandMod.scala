package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput
import typingsSlinky.awsSdkClientKmsBrowser.typesListGrantsOutputMod.ListGrantsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGrantsCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ListGrantsCommand", "ListGrantsCommand")
  @js.native
  class ListGrantsCommand protected () extends Command[
          InputTypesUnion, 
          ListGrantsInput, 
          OutputTypesUnion, 
          ListGrantsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListGrantsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
  }
}
