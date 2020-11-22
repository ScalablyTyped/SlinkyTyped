package typingsSlinky.awsSdkMiddlewareSerde

import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandlerOptions
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.serdeMod.EndpointBearer
import typingsSlinky.awsSdkTypes.serdeMod.RequestSerializer
import typingsSlinky.awsSdkTypes.serdeMod.ResponseDeserializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-serde/dist/cjs/serdePlugin", JSImport.Namespace)
@js.native
object serdePluginMod extends js.Object {
  
  val deserializerMiddlewareOption: DeserializeHandlerOptions = js.native
  
  def getSerdePlugin[InputType /* <: js.Object */, SerDeContext /* <: EndpointBearer */, OutputType /* <: MetadataBearer */](
    config: SerDeContext,
    serializer: RequestSerializer[_, SerDeContext],
    deserializer: ResponseDeserializer[OutputType, _, SerDeContext]
  ): Pluggable[InputType, OutputType] = js.native
  
  val serializerMiddlewareOption: SerializeHandlerOptions = js.native
}
