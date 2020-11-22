package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
import typingsSlinky.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/ListObjectsCommand", JSImport.Namespace)
@js.native
object listObjectsCommandMod extends js.Object {
  
  @js.native
  class ListObjectsCommand protected () extends Command[
          InputTypesUnion, 
          ListObjectsInput, 
          OutputTypesUnion, 
          ListObjectsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListObjectsInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
  }
}
