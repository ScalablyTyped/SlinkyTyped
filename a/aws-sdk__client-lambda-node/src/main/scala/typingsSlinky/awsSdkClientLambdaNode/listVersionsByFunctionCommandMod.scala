package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesListVersionsByFunctionOutputMod.ListVersionsByFunctionOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/ListVersionsByFunctionCommand", JSImport.Namespace)
@js.native
object listVersionsByFunctionCommandMod extends js.Object {
  
  @js.native
  class ListVersionsByFunctionCommand protected () extends Command[
          InputTypesUnion, 
          ListVersionsByFunctionInput, 
          OutputTypesUnion, 
          ListVersionsByFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListVersionsByFunctionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
  }
}
