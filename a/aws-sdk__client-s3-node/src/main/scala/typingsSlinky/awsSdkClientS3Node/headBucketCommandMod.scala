package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput
import typingsSlinky.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/HeadBucketCommand", JSImport.Namespace)
@js.native
object headBucketCommandMod extends js.Object {
  
  @js.native
  class HeadBucketCommand protected () extends Command[
          InputTypesUnion, 
          HeadBucketInput, 
          OutputTypesUnion, 
          HeadBucketOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: HeadBucketInput) = this()
    
    val middlewareStack: MiddlewareStack[HeadBucketInput, HeadBucketOutput, Readable] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[HeadBucketInput, HeadBucketOutput] = js.native
  }
}
