package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
import typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/SelectObjectContentCommand", JSImport.Namespace)
@js.native
object selectObjectContentCommandMod extends js.Object {
  @js.native
  class SelectObjectContentCommand protected () extends Command[
          InputTypesUnion, 
          SelectObjectContentInput, 
          OutputTypesUnion, 
          SelectObjectContentOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: SelectObjectContentInput) = this()
    val middlewareStack: MiddlewareStack[SelectObjectContentInput, SelectObjectContentOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
  }
  
}

