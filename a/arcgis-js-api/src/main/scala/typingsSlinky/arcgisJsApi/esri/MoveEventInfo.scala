package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`move-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`move-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.move
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveEventInfo
  extends Object
     with UpdateToolEventInfo {
  
  /**
    * Number of pixels moved on the x-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dx: Double = js.native
  
  /**
    * Number of pixels moved on the y-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dy: Double = js.native
  
  /**
    * The instance of the graphic that is being moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var mover: Graphic = js.native
  
  /**
    * Returns information indicating the stage of the move operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var `type`: `move-start` | move | `move-stop` = js.native
}
object MoveEventInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    dx: Double,
    dy: Double,
    hasOwnProperty: PropertyKey => Boolean,
    mover: Graphic,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `move-start` | move | `move-stop`
  ): MoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mover = mover.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveEventInfo]
  }
  
  @scala.inline
  implicit class MoveEventInfoMutableBuilder[Self <: MoveEventInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMover(value: Graphic): Self = StObject.set(x, "mover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `move-start` | move | `move-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
