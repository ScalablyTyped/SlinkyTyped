package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsOutputMod.ListShardsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listShardsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/ListShardsCommand", "ListShardsCommand")
  @js.native
  class ListShardsCommand protected () extends Command[
          InputTypesUnion, 
          ListShardsInput, 
          OutputTypesUnion, 
          ListShardsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: ListShardsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[ListShardsInput, ListShardsOutput] = js.native
  }
}
