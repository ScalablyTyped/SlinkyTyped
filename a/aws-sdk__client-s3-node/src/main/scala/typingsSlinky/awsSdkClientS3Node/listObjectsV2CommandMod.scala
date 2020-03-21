package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input
import typingsSlinky.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListObjectsV2Command", JSImport.Namespace)
@js.native
object listObjectsV2CommandMod extends js.Object {
  @js.native
  class ListObjectsV2Command protected () extends Command[
          InputTypesUnion, 
          ListObjectsV2Input, 
          OutputTypesUnion, 
          ListObjectsV2Output, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListObjectsV2Input) = this()
    /* CompleteClass */
    override val input: ListObjectsV2Input = js.native
    val middlewareStack: MiddlewareStack[ListObjectsV2Input, ListObjectsV2Output, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsV2Input, ListObjectsV2Output] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsV2Input, ListObjectsV2Output] = js.native
  }
  
}

