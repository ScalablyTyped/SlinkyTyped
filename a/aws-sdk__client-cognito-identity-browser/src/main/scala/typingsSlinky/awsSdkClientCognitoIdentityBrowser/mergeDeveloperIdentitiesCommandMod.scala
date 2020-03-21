package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
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
    /* CompleteClass */
    override val input: MergeDeveloperIdentitiesInput = js.native
    val middlewareStack: MiddlewareStack[
        MergeDeveloperIdentitiesInput, 
        MergeDeveloperIdentitiesOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
  }
  
}

