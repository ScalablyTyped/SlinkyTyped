package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/CompleteMultipartUploadCommand", JSImport.Namespace)
@js.native
object completeMultipartUploadCommandMod extends js.Object {
  @js.native
  class CompleteMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          CompleteMultipartUploadInput, 
          OutputTypesUnion, 
          CompleteMultipartUploadOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: CompleteMultipartUploadInput) = this()
    val middlewareStack: MiddlewareStack[CompleteMultipartUploadInput, CompleteMultipartUploadOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
  }
  
}

