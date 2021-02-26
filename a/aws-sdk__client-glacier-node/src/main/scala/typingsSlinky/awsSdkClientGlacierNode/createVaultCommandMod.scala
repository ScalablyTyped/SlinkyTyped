package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultOutputMod.CreateVaultOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/CreateVaultCommand", "CreateVaultCommand")
  @js.native
  class CreateVaultCommand protected () extends Command[
          InputTypesUnion, 
          CreateVaultInput, 
          OutputTypesUnion, 
          CreateVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: CreateVaultInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[CreateVaultInput, CreateVaultOutput] = js.native
  }
}
