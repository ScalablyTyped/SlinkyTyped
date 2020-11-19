package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput
import typingsSlinky.awsSdkClientKmsNode.typesListResourceTagsOutputMod.ListResourceTagsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/ListResourceTagsCommand", JSImport.Namespace)
@js.native
object listResourceTagsCommandMod extends js.Object {
  
  @js.native
  class ListResourceTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListResourceTagsInput, 
          OutputTypesUnion, 
          ListResourceTagsOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListResourceTagsInput) = this()
    
    val middlewareStack: MiddlewareStack[ListResourceTagsInput, ListResourceTagsOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
  }
}
