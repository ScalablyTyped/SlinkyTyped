package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typingsSlinky.awsSdkClientXrayNode.typesGetTraceSummariesOutputMod.GetTraceSummariesOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTraceSummariesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetTraceSummariesCommand", "GetTraceSummariesCommand")
  @js.native
  class GetTraceSummariesCommand protected () extends Command[
          InputTypesUnion, 
          GetTraceSummariesInput, 
          OutputTypesUnion, 
          GetTraceSummariesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetTraceSummariesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
  }
}
