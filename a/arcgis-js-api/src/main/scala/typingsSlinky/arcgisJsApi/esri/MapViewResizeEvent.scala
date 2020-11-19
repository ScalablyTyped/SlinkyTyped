package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapViewResizeEvent extends js.Object {
  
  var height: Double = js.native
  
  var oldHeight: Double = js.native
  
  var oldWidth: Double = js.native
  
  var width: Double = js.native
}
object MapViewResizeEvent {
  
  @scala.inline
  def apply(height: Double, oldHeight: Double, oldWidth: Double, width: Double): MapViewResizeEvent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], oldHeight = oldHeight.asInstanceOf[js.Any], oldWidth = oldWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewResizeEvent]
  }
  
  @scala.inline
  implicit class MapViewResizeEventOps[Self <: MapViewResizeEvent] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeight(value: Double): Self = this.set("oldHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldWidth(value: Double): Self = this.set("oldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
