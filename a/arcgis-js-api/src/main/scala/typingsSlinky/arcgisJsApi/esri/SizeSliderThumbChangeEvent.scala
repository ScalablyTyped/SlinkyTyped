package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeSliderThumbChangeEvent extends js.Object {
  
  var index: Double = js.native
  
  var oldValue: Double = js.native
  
  var `type`: `thumb-change` = js.native
  
  var value: Double = js.native
}
object SizeSliderThumbChangeEvent {
  
  @scala.inline
  def apply(index: Double, oldValue: Double, `type`: `thumb-change`, value: Double): SizeSliderThumbChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderThumbChangeEvent]
  }
  
  @scala.inline
  implicit class SizeSliderThumbChangeEventOps[Self <: SizeSliderThumbChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Double): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `thumb-change`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
