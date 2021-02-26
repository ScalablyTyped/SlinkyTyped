package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerStreamConsumerCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/RegisterStreamConsumerCommand", "RegisterStreamConsumerCommand")
  @js.native
  class RegisterStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          RegisterStreamConsumerInput, 
          OutputTypesUnion, 
          RegisterStreamConsumerOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: RegisterStreamConsumerInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
  }
}
