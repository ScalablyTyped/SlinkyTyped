package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput
import typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketsCommand", JSImport.Namespace)
@js.native
object listBucketsCommandMod extends js.Object {
  
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
    
    val middlewareStack: MiddlewareStack[ListBucketsInput, ListBucketsOutput, Readable] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketsInput, ListBucketsOutput] = js.native
  }
}
