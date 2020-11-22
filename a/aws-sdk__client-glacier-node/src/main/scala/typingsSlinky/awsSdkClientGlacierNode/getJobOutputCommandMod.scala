package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputOutputMod.GetJobOutputOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/GetJobOutputCommand", JSImport.Namespace)
@js.native
object getJobOutputCommandMod extends js.Object {
  
  @js.native
  class GetJobOutputCommand protected () extends Command[
          InputTypesUnion, 
          GetJobOutputInput, 
          OutputTypesUnion, 
          GetJobOutputOutput[Readable], 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetJobOutputInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
  }
}
