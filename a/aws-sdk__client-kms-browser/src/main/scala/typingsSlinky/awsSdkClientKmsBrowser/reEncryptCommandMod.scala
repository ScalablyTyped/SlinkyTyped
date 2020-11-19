package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput
import typingsSlinky.awsSdkClientKmsBrowser.typesReEncryptOutputMod.ReEncryptOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/ReEncryptCommand", JSImport.Namespace)
@js.native
object reEncryptCommandMod extends js.Object {
  
  @js.native
  class ReEncryptCommand protected () extends Command[
          InputTypesUnion, 
          ReEncryptInput, 
          OutputTypesUnion, 
          ReEncryptOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ReEncryptInput) = this()
    
    val middlewareStack: MiddlewareStack[ReEncryptInput, ReEncryptOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
  }
}
