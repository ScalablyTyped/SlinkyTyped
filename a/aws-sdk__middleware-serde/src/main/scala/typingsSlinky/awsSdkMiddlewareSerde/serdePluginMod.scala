package typingsSlinky.awsSdkMiddlewareSerde

import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandlerOptions
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.serdeMod.EndpointBearer
import typingsSlinky.awsSdkTypes.serdeMod.RequestSerializer
import typingsSlinky.awsSdkTypes.serdeMod.ResponseDeserializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serdePluginMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist/cjs/serdePlugin", "deserializerMiddlewareOption")
  @js.native
  val deserializerMiddlewareOption: DeserializeHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-serde/dist/cjs/serdePlugin", "getSerdePlugin")
  @js.native
  def getSerdePlugin[InputType /* <: js.Object */, SerDeContext /* <: EndpointBearer */, OutputType /* <: MetadataBearer */](
    config: SerDeContext,
    serializer: RequestSerializer[_, SerDeContext],
    deserializer: ResponseDeserializer[OutputType, _, SerDeContext]
  ): Pluggable[InputType, OutputType] = js.native
  
  @JSImport("@aws-sdk/middleware-serde/dist/cjs/serdePlugin", "serializerMiddlewareOption")
  @js.native
  val serializerMiddlewareOption: SerializeHandlerOptions = js.native
}
