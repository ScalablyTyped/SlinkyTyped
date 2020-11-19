package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    
    val middlewareStack: MiddlewareStack[DescribeIdentityInput, DescribeIdentityOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityInput, DescribeIdentityOutput] = js.native
  }
}
