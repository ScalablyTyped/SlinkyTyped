package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupAnimation extends js.Object {
  
  var close: js.UndefOr[PopupAnimationClose] = js.native
  
  var open: js.UndefOr[PopupAnimationOpen] = js.native
}
object PopupAnimation {
  
  @scala.inline
  def apply(): PopupAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupAnimation]
  }
  
  @scala.inline
  implicit class PopupAnimationOps[Self <: PopupAnimation] (val x: Self) extends AnyVal {
    
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
    def setClose(value: PopupAnimationClose): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setOpen(value: PopupAnimationOpen): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
}
