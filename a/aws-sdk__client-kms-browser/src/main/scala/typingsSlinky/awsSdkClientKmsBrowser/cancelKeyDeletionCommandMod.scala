package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
import typingsSlinky.awsSdkClientKmsBrowser.typesCancelKeyDeletionOutputMod.CancelKeyDeletionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/CancelKeyDeletionCommand", JSImport.Namespace)
@js.native
object cancelKeyDeletionCommandMod extends js.Object {
  @js.native
  class CancelKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          CancelKeyDeletionInput, 
          OutputTypesUnion, 
          CancelKeyDeletionOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: CancelKeyDeletionInput) = this()
    /* CompleteClass */
    override val input: CancelKeyDeletionInput = js.native
    val middlewareStack: MiddlewareStack[CancelKeyDeletionInput, CancelKeyDeletionOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
  }
  
}

