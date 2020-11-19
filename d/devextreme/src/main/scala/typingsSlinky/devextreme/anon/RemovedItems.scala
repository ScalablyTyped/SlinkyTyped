package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxButtonGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemovedItems extends js.Object {
  
  var addedItems: js.UndefOr[js.Array[_]] = js.native
  
  var component: js.UndefOr[dxButtonGroup] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var removedItems: js.UndefOr[js.Array[_]] = js.native
}
object RemovedItems {
  
  @scala.inline
  def apply(): RemovedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovedItems]
  }
  
  @scala.inline
  implicit class RemovedItemsOps[Self <: RemovedItems] (val x: Self) extends AnyVal {
    
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
    def setAddedItemsVarargs(value: js.Any*): Self = this.set("addedItems", js.Array(value :_*))
    
    @scala.inline
    def setAddedItems(value: js.Array[_]): Self = this.set("addedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedItems: Self = this.set("addedItems", js.undefined)
    
    @scala.inline
    def setComponent(value: dxButtonGroup): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRemovedItemsVarargs(value: js.Any*): Self = this.set("removedItems", js.Array(value :_*))
    
    @scala.inline
    def setRemovedItems(value: js.Array[_]): Self = this.set("removedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedItems: Self = this.set("removedItems", js.undefined)
  }
}
