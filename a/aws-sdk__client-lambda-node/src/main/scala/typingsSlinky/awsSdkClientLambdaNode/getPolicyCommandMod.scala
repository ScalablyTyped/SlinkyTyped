package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyOutputMod.GetPolicyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetPolicyCommand", "GetPolicyCommand")
  @js.native
  class GetPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetPolicyInput, 
          OutputTypesUnion, 
          GetPolicyOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetPolicyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
  }
}
