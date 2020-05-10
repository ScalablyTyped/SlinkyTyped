package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
import typingsSlinky.awsSdkClientGlacierNode.typesListJobsOutputMod.ListJobsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListJobsCommand", JSImport.Namespace)
@js.native
object listJobsCommandMod extends js.Object {
  @js.native
  class ListJobsCommand protected () extends Command[
          InputTypesUnion, 
          ListJobsInput, 
          OutputTypesUnion, 
          ListJobsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListJobsInput) = this()
    val middlewareStack: MiddlewareStack[ListJobsInput, ListJobsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
  }
  
}

