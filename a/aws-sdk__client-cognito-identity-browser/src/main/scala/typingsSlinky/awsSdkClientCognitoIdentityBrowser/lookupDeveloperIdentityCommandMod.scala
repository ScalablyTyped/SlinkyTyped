package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/LookupDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object lookupDeveloperIdentityCommandMod extends js.Object {
  @js.native
  class LookupDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          LookupDeveloperIdentityInput, 
          OutputTypesUnion, 
          LookupDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: LookupDeveloperIdentityInput) = this()
    /* CompleteClass */
    override val input: LookupDeveloperIdentityInput = js.native
    val middlewareStack: MiddlewareStack[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
  }
  
}

