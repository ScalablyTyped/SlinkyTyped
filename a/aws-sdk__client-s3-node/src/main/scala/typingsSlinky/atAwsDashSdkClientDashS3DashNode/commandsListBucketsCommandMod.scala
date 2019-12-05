package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesListBucketsInputMod.ListBucketsInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesListBucketsOutputMod.ListBucketsOutput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketsCommand", JSImport.Namespace)
@js.native
object commandsListBucketsCommandMod extends js.Object {
  @js.native
  class ListBucketsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketsInput, 
          OutputTypesUnion, 
          ListBucketsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBucketsInput) = this()
    /* CompleteClass */
    override val input: ListBucketsInput = js.native
    val middlewareStack: MiddlewareStack[ListBucketsInput, ListBucketsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketsInput, ListBucketsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketsInput, ListBucketsOutput] = js.native
  }
  
}

