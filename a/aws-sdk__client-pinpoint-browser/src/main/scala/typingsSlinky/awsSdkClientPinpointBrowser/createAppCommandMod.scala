package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAppCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateAppCommand", "CreateAppCommand")
  @js.native
  class CreateAppCommand protected () extends Command[
          InputTypesUnion, 
          CreateAppInput, 
          OutputTypesUnion, 
          CreateAppOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateAppInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
  }
}
