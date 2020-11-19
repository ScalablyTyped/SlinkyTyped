package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.StreamLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.StreamLayer")
@js.native
/**
  * The stream layer connects to a stream of data using [WebSockets](https://developer.mozilla.org/en-US/docs/Web/API/WebSocket). It connects to a server that emits geographic features continuously. The stream layer is suitable when you would like to map dynamic streams of data that are unbounded and continuous. When a stream layer is added to a map, users are able to see real-time updates pushed out by the server.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html)
  */
class StreamLayerCls ()
  extends typingsSlinky.arcgisJsApi.esri.StreamLayer {
  def this(properties: StreamLayerProperties) = this()
}
