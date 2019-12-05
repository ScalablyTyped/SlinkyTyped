package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AddTagsToVaultCommand", JSImport.Namespace)
@js.native
object commandsAddTagsToVaultCommandMod extends js.Object {
  @js.native
  class AddTagsToVaultCommand protected () extends Command[
          InputTypesUnion, 
          AddTagsToVaultInput, 
          OutputTypesUnion, 
          AddTagsToVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: AddTagsToVaultInput) = this()
    /* CompleteClass */
    override val input: AddTagsToVaultInput = js.native
    val middlewareStack: MiddlewareStack[AddTagsToVaultInput, AddTagsToVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
  }
  
}

