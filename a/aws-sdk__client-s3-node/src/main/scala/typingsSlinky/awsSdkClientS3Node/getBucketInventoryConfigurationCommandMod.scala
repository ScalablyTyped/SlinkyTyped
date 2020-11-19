package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketInventoryConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketInventoryConfigurationCommandMod extends js.Object {
  
  @js.native
  class GetBucketInventoryConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          GetBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketInventoryConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[
        GetBucketInventoryConfigurationInput, 
        GetBucketInventoryConfigurationOutput, 
        Readable
      ] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketInventoryConfigurationInput, GetBucketInventoryConfigurationOutput] = js.native
  }
}
