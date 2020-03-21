package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
import typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod.ListProvisionedCapacityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListProvisionedCapacityCommand", JSImport.Namespace)
@js.native
object listProvisionedCapacityCommandMod extends js.Object {
  @js.native
  class ListProvisionedCapacityCommand protected () extends Command[
          InputTypesUnion, 
          ListProvisionedCapacityInput, 
          OutputTypesUnion, 
          ListProvisionedCapacityOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListProvisionedCapacityInput) = this()
    /* CompleteClass */
    override val input: ListProvisionedCapacityInput = js.native
    val middlewareStack: MiddlewareStack[ListProvisionedCapacityInput, ListProvisionedCapacityOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
  }
  
}

