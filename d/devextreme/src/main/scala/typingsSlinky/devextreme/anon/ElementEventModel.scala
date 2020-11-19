package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.DevExpress.viz.dxRangeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementEventModel extends js.Object {
  
  var component: js.UndefOr[dxRangeSelector] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var previousValue: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  
  var value: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
}
object ElementEventModel {
  
  @scala.inline
  def apply(): ElementEventModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementEventModel]
  }
  
  @scala.inline
  implicit class ElementEventModelOps[Self <: ElementEventModel] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: dxRangeSelector): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPreviousValueVarargs(value: (Double | String | js.Date)*): Self = this.set("previousValue", js.Array(value :_*))
    
    @scala.inline
    def setPreviousValue(value: js.Array[Double | String | js.Date]): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousValue: Self = this.set("previousValue", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (Double | String | js.Date)*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[Double | String | js.Date]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
