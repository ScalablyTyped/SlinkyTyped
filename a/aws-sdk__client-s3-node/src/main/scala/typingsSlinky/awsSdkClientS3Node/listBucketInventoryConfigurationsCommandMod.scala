package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
import typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketInventoryConfigurationsCommand", JSImport.Namespace)
@js.native
object listBucketInventoryConfigurationsCommandMod extends js.Object {
  @js.native
  class ListBucketInventoryConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketInventoryConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketInventoryConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBucketInventoryConfigurationsInput) = this()
    /* CompleteClass */
    override val input: ListBucketInventoryConfigurationsInput = js.native
    val middlewareStack: MiddlewareStack[
        ListBucketInventoryConfigurationsInput, 
        ListBucketInventoryConfigurationsOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketInventoryConfigurationsInput, ListBucketInventoryConfigurationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketInventoryConfigurationsInput, ListBucketInventoryConfigurationsOutput] = js.native
  }
  
}

