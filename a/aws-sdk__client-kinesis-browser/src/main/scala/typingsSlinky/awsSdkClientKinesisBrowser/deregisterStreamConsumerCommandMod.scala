package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/DeregisterStreamConsumerCommand", JSImport.Namespace)
@js.native
object deregisterStreamConsumerCommandMod extends js.Object {
  
  @js.native
  class DeregisterStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          DeregisterStreamConsumerInput, 
          OutputTypesUnion, 
          DeregisterStreamConsumerOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeregisterStreamConsumerInput) = this()
    
    val middlewareStack: MiddlewareStack[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
  }
}
