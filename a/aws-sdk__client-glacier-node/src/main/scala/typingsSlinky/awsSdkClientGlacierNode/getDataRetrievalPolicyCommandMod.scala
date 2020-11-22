package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyOutputMod.GetDataRetrievalPolicyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/GetDataRetrievalPolicyCommand", JSImport.Namespace)
@js.native
object getDataRetrievalPolicyCommandMod extends js.Object {
  
  @js.native
  class GetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          GetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetDataRetrievalPolicyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput] = js.native
  }
}
