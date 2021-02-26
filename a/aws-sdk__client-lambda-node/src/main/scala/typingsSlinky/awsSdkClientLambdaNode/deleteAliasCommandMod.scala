package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteAliasOutputMod.DeleteAliasOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteAliasCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteAliasCommand", "DeleteAliasCommand")
  @js.native
  class DeleteAliasCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAliasInput, 
          OutputTypesUnion, 
          DeleteAliasOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteAliasInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
  }
}
