package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveOutputMod.DeleteArchiveOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteArchiveCommand", JSImport.Namespace)
@js.native
object deleteArchiveCommandMod extends js.Object {
  @js.native
  class DeleteArchiveCommand protected () extends Command[
          InputTypesUnion, 
          DeleteArchiveInput, 
          OutputTypesUnion, 
          DeleteArchiveOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteArchiveInput) = this()
    /* CompleteClass */
    override val input: DeleteArchiveInput = js.native
    val middlewareStack: MiddlewareStack[DeleteArchiveInput, DeleteArchiveOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteArchiveInput, DeleteArchiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteArchiveInput, DeleteArchiveOutput] = js.native
  }
  
}

