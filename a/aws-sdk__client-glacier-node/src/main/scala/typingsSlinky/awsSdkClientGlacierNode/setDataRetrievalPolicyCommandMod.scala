package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/SetDataRetrievalPolicyCommand", JSImport.Namespace)
@js.native
object setDataRetrievalPolicyCommandMod extends js.Object {
  
  @js.native
  class SetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          SetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          SetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: SetDataRetrievalPolicyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
  }
}
