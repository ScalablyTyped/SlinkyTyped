package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput
import typingsSlinky.awsSdkClientKmsBrowser.typesEncryptOutputMod.EncryptOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/EncryptCommand", JSImport.Namespace)
@js.native
object encryptCommandMod extends js.Object {
  @js.native
  class EncryptCommand protected () extends Command[
          InputTypesUnion, 
          EncryptInput, 
          OutputTypesUnion, 
          EncryptOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: EncryptInput) = this()
    /* CompleteClass */
    override val input: EncryptInput = js.native
    val middlewareStack: MiddlewareStack[EncryptInput, EncryptOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
  }
  
}

