package typingsSlinky.awsSdkMiddlewareSerde

import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.SerializeMiddleware
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.serdeMod.EndpointBearer
import typingsSlinky.awsSdkTypes.serdeMod.RequestSerializer
import typingsSlinky.awsSdkTypes.serdeMod.ResponseDeserializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-serde", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def deserializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils](options: RuntimeUtils, deserializer: ResponseDeserializer[_, _, RuntimeUtils]): DeserializeMiddleware[Input, Output] = js.native
  
  val deserializerMiddlewareOption: DeserializeHandlerOptions = js.native
  
  def getSerdePlugin[InputType /* <: js.Object */, SerDeContext /* <: EndpointBearer */, OutputType /* <: MetadataBearer */](
    config: SerDeContext,
    serializer: RequestSerializer[_, SerDeContext],
    deserializer: ResponseDeserializer[OutputType, _, SerDeContext]
  ): Pluggable[InputType, OutputType] = js.native
  
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils /* <: EndpointBearer */](options: RuntimeUtils, serializer: RequestSerializer[_, RuntimeUtils]): SerializeMiddleware[Input, Output] = js.native
  
  val serializerMiddlewareOption: SerializeHandlerOptions = js.native
}
