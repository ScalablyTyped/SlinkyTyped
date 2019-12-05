package typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListTagsForStreamCommand", JSImport.Namespace)
@js.native
object commandsListTagsForStreamCommandMod extends js.Object {
  @js.native
  class ListTagsForStreamCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsForStreamInput, 
          OutputTypesUnion, 
          ListTagsForStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTagsForStreamInput) = this()
    /* CompleteClass */
    override val input: ListTagsForStreamInput = js.native
    val middlewareStack: MiddlewareStack[ListTagsForStreamInput, ListTagsForStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
  }
  
}

