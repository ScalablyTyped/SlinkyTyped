package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkIdentityCommand", JSImport.Namespace)
@js.native
object unlinkIdentityCommandMod extends js.Object {
  
  @js.native
  class UnlinkIdentityCommand protected () extends Command[
          InputTypesUnion, 
          UnlinkIdentityInput, 
          OutputTypesUnion, 
          UnlinkIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: UnlinkIdentityInput) = this()
    
    val middlewareStack: MiddlewareStack[UnlinkIdentityInput, UnlinkIdentityOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
  }
}
