package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
import typingsSlinky.awsSdkClientKmsNode.typesCreateAliasOutputMod.CreateAliasOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/CreateAliasCommand", JSImport.Namespace)
@js.native
object createAliasCommandMod extends js.Object {
  
  @js.native
  class CreateAliasCommand protected () extends Command[
          InputTypesUnion, 
          CreateAliasInput, 
          OutputTypesUnion, 
          CreateAliasOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateAliasInput) = this()
    
    val middlewareStack: MiddlewareStack[CreateAliasInput, CreateAliasOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  }
}
