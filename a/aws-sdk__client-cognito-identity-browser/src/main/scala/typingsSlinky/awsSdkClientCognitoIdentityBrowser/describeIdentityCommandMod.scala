package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityCommand", JSImport.Namespace)
@js.native
object describeIdentityCommandMod extends js.Object {
  @js.native
  class DescribeIdentityCommand protected () extends Command[
          InputTypesUnion, 
          DescribeIdentityInput, 
          OutputTypesUnion, 
          DescribeIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeIdentityInput) = this()
    /* CompleteClass */
    override val input: DescribeIdentityInput = js.native
    val middlewareStack: MiddlewareStack[DescribeIdentityInput, DescribeIdentityOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityInput, DescribeIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityInput, DescribeIdentityOutput] = js.native
  }
  
}

