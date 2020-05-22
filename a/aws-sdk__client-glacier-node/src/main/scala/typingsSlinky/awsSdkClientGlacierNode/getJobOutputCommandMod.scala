package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputOutputMod.GetJobOutputOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetJobOutputCommand", JSImport.Namespace)
@js.native
object getJobOutputCommandMod extends js.Object {
  @js.native
  class GetJobOutputCommand protected () extends Command[
          InputTypesUnion, 
          GetJobOutputInput, 
          OutputTypesUnion, 
          GetJobOutputOutput[Readable], 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetJobOutputInput) = this()
    /* CompleteClass */
    override val input: GetJobOutputInput = js.native
    val middlewareStack: MiddlewareStack[GetJobOutputInput, GetJobOutputOutput[Readable], Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
  }
  
}

