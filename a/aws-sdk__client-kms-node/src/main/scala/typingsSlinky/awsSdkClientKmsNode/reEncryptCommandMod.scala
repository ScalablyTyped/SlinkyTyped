package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput
import typingsSlinky.awsSdkClientKmsNode.typesReEncryptOutputMod.ReEncryptOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/ReEncryptCommand", JSImport.Namespace)
@js.native
object reEncryptCommandMod extends js.Object {
  
  @js.native
  class ReEncryptCommand protected () extends Command[
          InputTypesUnion, 
          ReEncryptInput, 
          OutputTypesUnion, 
          ReEncryptOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ReEncryptInput) = this()
    
    val middlewareStack: MiddlewareStack[ReEncryptInput, ReEncryptOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
  }
}
