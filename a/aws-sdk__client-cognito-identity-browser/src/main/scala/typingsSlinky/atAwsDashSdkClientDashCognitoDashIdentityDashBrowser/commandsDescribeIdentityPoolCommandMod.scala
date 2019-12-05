package typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityPoolCommand", JSImport.Namespace)
@js.native
object commandsDescribeIdentityPoolCommandMod extends js.Object {
  @js.native
  class DescribeIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          DescribeIdentityPoolInput, 
          OutputTypesUnion, 
          DescribeIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeIdentityPoolInput) = this()
    /* CompleteClass */
    override val input: DescribeIdentityPoolInput = js.native
    val middlewareStack: MiddlewareStack[DescribeIdentityPoolInput, DescribeIdentityPoolOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
  }
  
}

