package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput
import typingsSlinky.awsSdkClientKmsNode.typesListGrantsOutputMod.ListGrantsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListGrantsCommand", JSImport.Namespace)
@js.native
object listGrantsCommandMod extends js.Object {
  @js.native
  class ListGrantsCommand protected () extends Command[
          InputTypesUnion, 
          ListGrantsInput, 
          OutputTypesUnion, 
          ListGrantsOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListGrantsInput) = this()
    val middlewareStack: MiddlewareStack[ListGrantsInput, ListGrantsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
  }
  
}

