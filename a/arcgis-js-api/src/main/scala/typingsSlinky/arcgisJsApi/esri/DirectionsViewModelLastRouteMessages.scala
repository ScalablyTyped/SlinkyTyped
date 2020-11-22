package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsViewModelLastRouteMessages extends Object {
  
  /**
    * A descriptive message of the returned mesage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var description: String = js.native
  
  /**
    * Number indicating the message type returned from the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var `type`: Double = js.native
}
object DirectionsViewModelLastRouteMessages {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: Double
  ): DirectionsViewModelLastRouteMessages = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelLastRouteMessages]
  }
  
  @scala.inline
  implicit class DirectionsViewModelLastRouteMessagesOps[Self <: DirectionsViewModelLastRouteMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
