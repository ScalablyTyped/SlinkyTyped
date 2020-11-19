package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typingsSlinky.awsSdkClientKmsBrowser.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/ListRetirableGrantsCommand", JSImport.Namespace)
@js.native
object listRetirableGrantsCommandMod extends js.Object {
  
  @js.native
  class ListRetirableGrantsCommand protected () extends Command[
          InputTypesUnion, 
          ListRetirableGrantsInput, 
          OutputTypesUnion, 
          ListRetirableGrantsOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListRetirableGrantsInput) = this()
    
    val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  }
}
