package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typingsSlinky.awsSdkClientKmsNode.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/ListRetirableGrantsCommand", JSImport.Namespace)
@js.native
object listRetirableGrantsCommandMod extends js.Object {
  
  @js.native
  class ListRetirableGrantsCommand protected () extends Command[
          InputTypesUnion, 
          ListRetirableGrantsInput, 
          OutputTypesUnion, 
          ListRetirableGrantsOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListRetirableGrantsInput) = this()
    
    val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  }
}
