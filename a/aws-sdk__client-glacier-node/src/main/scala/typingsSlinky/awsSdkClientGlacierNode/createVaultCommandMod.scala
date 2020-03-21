package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultOutputMod.CreateVaultOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/CreateVaultCommand", JSImport.Namespace)
@js.native
object createVaultCommandMod extends js.Object {
  @js.native
  class CreateVaultCommand protected () extends Command[
          InputTypesUnion, 
          CreateVaultInput, 
          OutputTypesUnion, 
          CreateVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateVaultInput) = this()
    /* CompleteClass */
    override val input: CreateVaultInput = js.native
    val middlewareStack: MiddlewareStack[CreateVaultInput, CreateVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[CreateVaultInput, CreateVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[CreateVaultInput, CreateVaultOutput] = js.native
  }
  
}

