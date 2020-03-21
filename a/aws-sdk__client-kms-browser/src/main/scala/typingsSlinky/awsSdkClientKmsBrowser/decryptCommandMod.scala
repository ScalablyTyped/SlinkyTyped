package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput
import typingsSlinky.awsSdkClientKmsBrowser.typesDecryptOutputMod.DecryptOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/DecryptCommand", JSImport.Namespace)
@js.native
object decryptCommandMod extends js.Object {
  @js.native
  class DecryptCommand protected () extends Command[
          InputTypesUnion, 
          DecryptInput, 
          OutputTypesUnion, 
          DecryptOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: DecryptInput) = this()
    /* CompleteClass */
    override val input: DecryptInput = js.native
    val middlewareStack: MiddlewareStack[DecryptInput, DecryptOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
  }
  
}

