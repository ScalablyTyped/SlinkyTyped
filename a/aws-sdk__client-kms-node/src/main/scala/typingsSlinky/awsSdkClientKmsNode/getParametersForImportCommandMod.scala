package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput
import typingsSlinky.awsSdkClientKmsNode.typesGetParametersForImportOutputMod.GetParametersForImportOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getParametersForImportCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GetParametersForImportCommand", "GetParametersForImportCommand")
  @js.native
  class GetParametersForImportCommand protected () extends Command[
          InputTypesUnion, 
          GetParametersForImportInput, 
          OutputTypesUnion, 
          GetParametersForImportOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GetParametersForImportInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
  }
}
