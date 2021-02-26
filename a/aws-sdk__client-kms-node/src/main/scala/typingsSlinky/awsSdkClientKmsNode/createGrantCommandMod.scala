package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput
import typingsSlinky.awsSdkClientKmsNode.typesCreateGrantOutputMod.CreateGrantOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGrantCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/CreateGrantCommand", "CreateGrantCommand")
  @js.native
  class CreateGrantCommand protected () extends Command[
          InputTypesUnion, 
          CreateGrantInput, 
          OutputTypesUnion, 
          CreateGrantOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CreateGrantInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
  }
}
