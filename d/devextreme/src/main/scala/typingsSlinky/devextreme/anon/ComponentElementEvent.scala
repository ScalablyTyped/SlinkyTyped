package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFileManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElementEvent extends js.Object {
  
  var component: js.UndefOr[dxFileManager] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var itemData: js.UndefOr[js.Any] = js.native
  
  var itemElement: js.UndefOr[dxElement] = js.native
  
  var itemIndex: js.UndefOr[Double] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object ComponentElementEvent {
  
  @scala.inline
  def apply(): ComponentElementEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentElementEvent]
  }
  
  @scala.inline
  implicit class ComponentElementEventOps[Self <: ComponentElementEvent] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: dxFileManager): Self = this.set("component", value.asInstanceOf[js.Any])
    
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
    def setItemData(value: js.Any): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemData: Self = this.set("itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = this.set("itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemElement: Self = this.set("itemElement", js.undefined)
    
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemIndex: Self = this.set("itemIndex", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
}
