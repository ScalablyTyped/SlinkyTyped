package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listStreamsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamsCommand", "ListStreamsCommand")
  @js.native
  class ListStreamsCommand protected () extends Command[
          InputTypesUnion, 
          ListStreamsInput, 
          OutputTypesUnion, 
          ListStreamsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: ListStreamsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
  }
}
