package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityPoolCommand", JSImport.Namespace)
@js.native
object describeIdentityPoolCommandMod extends js.Object {
  
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
    
    val middlewareStack: MiddlewareStack[DescribeIdentityPoolInput, DescribeIdentityPoolOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
  }
}
