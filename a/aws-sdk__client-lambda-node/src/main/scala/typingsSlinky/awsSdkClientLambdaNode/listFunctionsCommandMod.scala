package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsOutputMod.ListFunctionsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listFunctionsCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListFunctionsCommand", "ListFunctionsCommand")
  @js.native
  class ListFunctionsCommand protected () extends Command[
          InputTypesUnion, 
          ListFunctionsInput, 
          OutputTypesUnion, 
          ListFunctionsOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListFunctionsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
  }
}
