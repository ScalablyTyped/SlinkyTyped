package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput
import typingsSlinky.awsSdkClientKmsBrowser.typesRevokeGrantOutputMod.RevokeGrantOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/RevokeGrantCommand", JSImport.Namespace)
@js.native
object revokeGrantCommandMod extends js.Object {
  @js.native
  class RevokeGrantCommand protected () extends Command[
          InputTypesUnion, 
          RevokeGrantInput, 
          OutputTypesUnion, 
          RevokeGrantOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: RevokeGrantInput) = this()
    /* CompleteClass */
    override val input: RevokeGrantInput = js.native
    val middlewareStack: MiddlewareStack[RevokeGrantInput, RevokeGrantOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
  }
  
}

