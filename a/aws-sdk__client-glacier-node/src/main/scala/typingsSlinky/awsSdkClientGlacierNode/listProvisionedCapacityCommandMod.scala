package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
import typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod.ListProvisionedCapacityOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/ListProvisionedCapacityCommand", JSImport.Namespace)
@js.native
object listProvisionedCapacityCommandMod extends js.Object {
  
  @js.native
  class ListProvisionedCapacityCommand protected () extends Command[
          InputTypesUnion, 
          ListProvisionedCapacityInput, 
          OutputTypesUnion, 
          ListProvisionedCapacityOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListProvisionedCapacityInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListProvisionedCapacityInput, ListProvisionedCapacityOutput] = js.native
  }
}
