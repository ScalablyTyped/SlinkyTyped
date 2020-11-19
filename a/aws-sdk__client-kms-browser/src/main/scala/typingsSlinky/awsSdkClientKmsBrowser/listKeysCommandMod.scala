package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput
import typingsSlinky.awsSdkClientKmsBrowser.typesListKeysOutputMod.ListKeysOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/ListKeysCommand", JSImport.Namespace)
@js.native
object listKeysCommandMod extends js.Object {
  
  @js.native
  class ListKeysCommand protected () extends Command[
          InputTypesUnion, 
          ListKeysInput, 
          OutputTypesUnion, 
          ListKeysOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListKeysInput) = this()
    
    val middlewareStack: MiddlewareStack[ListKeysInput, ListKeysOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeysInput, ListKeysOutput] = js.native
  }
}
