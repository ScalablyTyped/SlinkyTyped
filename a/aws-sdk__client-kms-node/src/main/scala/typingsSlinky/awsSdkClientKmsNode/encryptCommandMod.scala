package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput
import typingsSlinky.awsSdkClientKmsNode.typesEncryptOutputMod.EncryptOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/EncryptCommand", JSImport.Namespace)
@js.native
object encryptCommandMod extends js.Object {
  
  @js.native
  class EncryptCommand protected () extends Command[
          InputTypesUnion, 
          EncryptInput, 
          OutputTypesUnion, 
          EncryptOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: EncryptInput) = this()
    
    val middlewareStack: MiddlewareStack[EncryptInput, EncryptOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
  }
}
