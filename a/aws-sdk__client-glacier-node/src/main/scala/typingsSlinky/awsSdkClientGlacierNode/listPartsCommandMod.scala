package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput
import typingsSlinky.awsSdkClientGlacierNode.typesListPartsOutputMod.ListPartsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listPartsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListPartsCommand", "ListPartsCommand")
  @js.native
  class ListPartsCommand protected () extends Command[
          InputTypesUnion, 
          ListPartsInput, 
          OutputTypesUnion, 
          ListPartsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListPartsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListPartsInput, ListPartsOutput] = js.native
  }
}
