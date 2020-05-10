package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/MergeDeveloperIdentitiesCommand", JSImport.Namespace)
@js.native
object mergeDeveloperIdentitiesCommandMod extends js.Object {
  @js.native
  class MergeDeveloperIdentitiesCommand protected () extends Command[
          InputTypesUnion, 
          MergeDeveloperIdentitiesInput, 
          OutputTypesUnion, 
          MergeDeveloperIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: MergeDeveloperIdentitiesInput) = this()
    val middlewareStack: MiddlewareStack[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
  }
  
}

