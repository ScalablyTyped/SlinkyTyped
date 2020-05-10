package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListMultipartUploadsCommand", JSImport.Namespace)
@js.native
object listMultipartUploadsCommandMod extends js.Object {
  @js.native
  class ListMultipartUploadsCommand protected () extends Command[
          InputTypesUnion, 
          ListMultipartUploadsInput, 
          OutputTypesUnion, 
          ListMultipartUploadsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListMultipartUploadsInput) = this()
    val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  }
  
}

