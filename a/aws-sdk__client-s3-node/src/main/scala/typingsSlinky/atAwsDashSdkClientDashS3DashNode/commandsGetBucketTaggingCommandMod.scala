package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketTaggingInputMod.GetBucketTaggingInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketTaggingCommand", JSImport.Namespace)
@js.native
object commandsGetBucketTaggingCommandMod extends js.Object {
  @js.native
  class GetBucketTaggingCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketTaggingInput, 
          OutputTypesUnion, 
          GetBucketTaggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketTaggingInput) = this()
    /* CompleteClass */
    override val input: GetBucketTaggingInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketTaggingInput, GetBucketTaggingOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketTaggingInput, GetBucketTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketTaggingInput, GetBucketTaggingOutput] = js.native
  }
  
}

