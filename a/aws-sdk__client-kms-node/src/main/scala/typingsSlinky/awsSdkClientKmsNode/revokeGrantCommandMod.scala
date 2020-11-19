package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
import typingsSlinky.awsSdkClientKmsNode.typesRevokeGrantOutputMod.RevokeGrantOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/RevokeGrantCommand", JSImport.Namespace)
@js.native
object revokeGrantCommandMod extends js.Object {
  
  @js.native
  class RevokeGrantCommand protected () extends Command[
          InputTypesUnion, 
          RevokeGrantInput, 
          OutputTypesUnion, 
          RevokeGrantOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: RevokeGrantInput) = this()
    
    val middlewareStack: MiddlewareStack[RevokeGrantInput, RevokeGrantOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
  }
}
