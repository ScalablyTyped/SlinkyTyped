package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput
import typingsSlinky.awsSdkClientKmsBrowser.typesReEncryptOutputMod.ReEncryptOutput
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
          KMSResolvedConfiguration
        ] {
    def this(input: ReEncryptInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
  }
}
