package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveOutputMod.UploadArchiveOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/UploadArchiveCommand", JSImport.Namespace)
@js.native
object uploadArchiveCommandMod extends js.Object {
  @js.native
  class UploadArchiveCommand protected () extends Command[
          InputTypesUnion, 
          UploadArchiveInput[Readable], 
          OutputTypesUnion, 
          UploadArchiveOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: UploadArchiveInput[Readable]) = this()
    /* CompleteClass */
    override val input: UploadArchiveInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[UploadArchiveInput[Readable], UploadArchiveOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadArchiveInput[Readable], UploadArchiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadArchiveInput[Readable], UploadArchiveOutput] = js.native
  }
  
}

