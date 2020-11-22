package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsOutputMod.ListEventSourceMappingsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/ListEventSourceMappingsCommand", JSImport.Namespace)
@js.native
object listEventSourceMappingsCommandMod extends js.Object {
  
  @js.native
  class ListEventSourceMappingsCommand protected () extends Command[
          InputTypesUnion, 
          ListEventSourceMappingsInput, 
          OutputTypesUnion, 
          ListEventSourceMappingsOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListEventSourceMappingsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
  }
}
