package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesDisableKeyOutputMod.DisableKeyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/DisableKeyCommand", JSImport.Namespace)
@js.native
object disableKeyCommandMod extends js.Object {
  
  @js.native
  class DisableKeyCommand protected () extends Command[
          InputTypesUnion, 
          DisableKeyInput, 
          OutputTypesUnion, 
          DisableKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DisableKeyInput) = this()
    
    val middlewareStack: MiddlewareStack[DisableKeyInput, DisableKeyOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyInput, DisableKeyOutput] = js.native
  }
}
