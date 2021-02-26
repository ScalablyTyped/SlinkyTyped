package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deregisterStreamConsumerCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DeregisterStreamConsumerCommand", "DeregisterStreamConsumerCommand")
  @js.native
  class DeregisterStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          DeregisterStreamConsumerInput, 
          OutputTypesUnion, 
          DeregisterStreamConsumerOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DeregisterStreamConsumerInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
  }
}
