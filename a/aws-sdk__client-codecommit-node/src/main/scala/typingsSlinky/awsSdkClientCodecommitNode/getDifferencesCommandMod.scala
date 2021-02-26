package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDifferencesCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetDifferencesCommand", "GetDifferencesCommand")
  @js.native
  class GetDifferencesCommand protected () extends Command[
          InputTypesUnion, 
          GetDifferencesInput, 
          OutputTypesUnion, 
          GetDifferencesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetDifferencesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
  }
}
