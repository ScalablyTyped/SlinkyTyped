package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput
import typingsSlinky.awsSdkClientKmsBrowser.typesRetireGrantOutputMod.RetireGrantOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/RetireGrantCommand", JSImport.Namespace)
@js.native
object retireGrantCommandMod extends js.Object {
  @js.native
  class RetireGrantCommand protected () extends Command[
          InputTypesUnion, 
          RetireGrantInput, 
          OutputTypesUnion, 
          RetireGrantOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: RetireGrantInput) = this()
    val middlewareStack: MiddlewareStack[RetireGrantInput, RetireGrantOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
  }
  
}

