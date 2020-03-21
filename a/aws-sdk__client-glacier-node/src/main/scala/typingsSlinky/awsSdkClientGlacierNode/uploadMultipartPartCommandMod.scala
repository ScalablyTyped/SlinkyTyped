package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartOutputMod.UploadMultipartPartOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/UploadMultipartPartCommand", JSImport.Namespace)
@js.native
object uploadMultipartPartCommandMod extends js.Object {
  @js.native
  class UploadMultipartPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadMultipartPartInput[Readable], 
          OutputTypesUnion, 
          UploadMultipartPartOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: UploadMultipartPartInput[Readable]) = this()
    /* CompleteClass */
    override val input: UploadMultipartPartInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[UploadMultipartPartInput[Readable], UploadMultipartPartOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
  }
  
}

