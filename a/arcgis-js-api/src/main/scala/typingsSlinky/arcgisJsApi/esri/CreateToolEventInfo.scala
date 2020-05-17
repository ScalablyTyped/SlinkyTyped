package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.VertexAddEventInfo
  - typingsSlinky.arcgisJsApi.esri.CursorUpdateEventInfo
*/
trait CreateToolEventInfo extends js.Object

object CreateToolEventInfo {
  @scala.inline
  implicit def apply(value: CursorUpdateEventInfo): CreateToolEventInfo = value.asInstanceOf[CreateToolEventInfo]
  @scala.inline
  implicit def apply(value: VertexAddEventInfo): CreateToolEventInfo = value.asInstanceOf[CreateToolEventInfo]
}

