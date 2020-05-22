package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
import typingsSlinky.awsSdkClientGlacierNode.typesListVaultsOutputMod.ListVaultsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListVaultsCommand", JSImport.Namespace)
@js.native
object listVaultsCommandMod extends js.Object {
  @js.native
  class ListVaultsCommand protected () extends Command[
          InputTypesUnion, 
          ListVaultsInput, 
          OutputTypesUnion, 
          ListVaultsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListVaultsInput) = this()
    /* CompleteClass */
    override val input: ListVaultsInput = js.native
    val middlewareStack: MiddlewareStack[ListVaultsInput, ListVaultsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
  }
  
}

