package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typingsSlinky.awsSdkClientKmsNode.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listKeyPoliciesCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ListKeyPoliciesCommand", "ListKeyPoliciesCommand")
  @js.native
  class ListKeyPoliciesCommand protected () extends Command[
          InputTypesUnion, 
          ListKeyPoliciesInput, 
          OutputTypesUnion, 
          ListKeyPoliciesOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListKeyPoliciesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  }
}
