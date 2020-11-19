package typingsSlinky.rcPicker.interfaceMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components extends js.Object {
  
  var button: js.UndefOr[ReactComponentClass[js.Object] | String] = js.native
  
  var rangeItem: js.UndefOr[ReactComponentClass[js.Object] | String] = js.native
}
object Components {
  
  @scala.inline
  def apply(): Components = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components]
  }
  
  @scala.inline
  implicit class ComponentsOps[Self <: Components] (val x: Self) extends AnyVal {
    
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
    def setButtonFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: ReactComponentClass[js.Object] | String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setRangeItemFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("rangeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeItemComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("rangeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeItem(value: ReactComponentClass[js.Object] | String): Self = this.set("rangeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeItem: Self = this.set("rangeItem", js.undefined)
  }
}
