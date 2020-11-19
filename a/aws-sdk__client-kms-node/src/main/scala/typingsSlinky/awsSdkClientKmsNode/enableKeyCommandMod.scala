package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesEnableKeyOutputMod.EnableKeyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/EnableKeyCommand", JSImport.Namespace)
@js.native
object enableKeyCommandMod extends js.Object {
  
  @js.native
  class EnableKeyCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyInput, 
          OutputTypesUnion, 
          EnableKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: EnableKeyInput) = this()
    
    val middlewareStack: MiddlewareStack[EnableKeyInput, EnableKeyOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
  }
}
