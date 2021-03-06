package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typingsSlinky.awsSdkClientXrayNode.typesPutTelemetryRecordsOutputMod.PutTelemetryRecordsOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putTelemetryRecordsCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/PutTelemetryRecordsCommand", "PutTelemetryRecordsCommand")
  @js.native
  class PutTelemetryRecordsCommand protected () extends Command[
          InputTypesUnion, 
          PutTelemetryRecordsInput, 
          OutputTypesUnion, 
          PutTelemetryRecordsOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: PutTelemetryRecordsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
  }
}
