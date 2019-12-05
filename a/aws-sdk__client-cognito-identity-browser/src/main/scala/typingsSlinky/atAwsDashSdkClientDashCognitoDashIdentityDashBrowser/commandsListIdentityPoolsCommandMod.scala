package typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentityPoolsCommand", JSImport.Namespace)
@js.native
object commandsListIdentityPoolsCommandMod extends js.Object {
  @js.native
  class ListIdentityPoolsCommand protected () extends Command[
          InputTypesUnion, 
          ListIdentityPoolsInput, 
          OutputTypesUnion, 
          ListIdentityPoolsOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListIdentityPoolsInput) = this()
    /* CompleteClass */
    override val input: ListIdentityPoolsInput = js.native
    val middlewareStack: MiddlewareStack[ListIdentityPoolsInput, ListIdentityPoolsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
  }
  
}

