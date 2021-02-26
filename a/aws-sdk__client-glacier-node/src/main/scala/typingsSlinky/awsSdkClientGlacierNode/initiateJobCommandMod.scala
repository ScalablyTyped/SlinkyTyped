package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobOutputMod.InitiateJobOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initiateJobCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/InitiateJobCommand", "InitiateJobCommand")
  @js.native
  class InitiateJobCommand protected () extends Command[
          InputTypesUnion, 
          InitiateJobInput, 
          OutputTypesUnion, 
          InitiateJobOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: InitiateJobInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
  }
}
