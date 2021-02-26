package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`move-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`move-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`rotate-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`rotate-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vertex-remove`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.move
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rotate
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.scale
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.MoveEventInfo
  - typingsSlinky.arcgisJsApi.esri.ReshapeEventInfo
  - typingsSlinky.arcgisJsApi.esri.RotateEventInfo
  - typingsSlinky.arcgisJsApi.esri.ScaleEventInfo
  - typingsSlinky.arcgisJsApi.esri.VertexAddEventInfo
  - typingsSlinky.arcgisJsApi.esri.VertexRemoveEventInfo
*/
trait UpdateToolEventInfo extends StObject
object UpdateToolEventInfo {
  
  @scala.inline
  def MoveEventInfo(
    constructor: js.Function,
    dx: Double,
    dy: Double,
    hasOwnProperty: PropertyKey => Boolean,
    mover: Graphic,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `move-start` | move | `move-stop`
  ): typingsSlinky.arcgisJsApi.esri.MoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mover = mover.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.MoveEventInfo]
  }
  
  @scala.inline
  def ReshapeEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): typingsSlinky.arcgisJsApi.esri.ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.ReshapeEventInfo]
  }
  
  @scala.inline
  def RotateEventInfo(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `rotate-start` | rotate | `rotate-stop`
  ): typingsSlinky.arcgisJsApi.esri.RotateEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.RotateEventInfo]
  }
  
  @scala.inline
  def ScaleEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `scale-start` | scale | `scale-stop`,
    xScale: Double,
    yScale: Double
  ): typingsSlinky.arcgisJsApi.esri.ScaleEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.ScaleEventInfo]
  }
  
  @scala.inline
  def VertexAddEventInfo(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `vertex-add`,
    vertices: js.Array[VertexAddEventInfoVertices]
  ): typingsSlinky.arcgisJsApi.esri.VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.VertexAddEventInfo]
  }
  
  @scala.inline
  def VertexRemoveEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    removed: js.Array[Graphic],
    `type`: `vertex-remove`,
    vertices: js.Array[VertexRemoveEventInfoVertices]
  ): typingsSlinky.arcgisJsApi.esri.VertexRemoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), removed = removed.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.VertexRemoveEventInfo]
  }
}
