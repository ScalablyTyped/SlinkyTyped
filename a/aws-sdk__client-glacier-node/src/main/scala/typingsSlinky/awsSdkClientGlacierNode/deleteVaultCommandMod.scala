package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultOutputMod.DeleteVaultOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultCommand", JSImport.Namespace)
@js.native
object deleteVaultCommandMod extends js.Object {
  @js.native
  class DeleteVaultCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultInput, 
          OutputTypesUnion, 
          DeleteVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultInput) = this()
    val middlewareStack: MiddlewareStack[DeleteVaultInput, DeleteVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultInput, DeleteVaultOutput] = js.native
  }
  
}

