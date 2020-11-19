package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapButtonEventMap extends ControlEventMap {
  
  var checkedChanged: ProcessingModeEventArgs = js.native
  
  var click: ButtonClickEventArgs = js.native
  
  var gotFocus: EventArgs = js.native
  
  var lostFocus: EventArgs = js.native
}
object BootstrapButtonEventMap {
  
  @scala.inline
  def apply(
    checkedChanged: ProcessingModeEventArgs,
    click: ButtonClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs
  ): BootstrapButtonEventMap = {
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapButtonEventMap]
  }
  
  @scala.inline
  implicit class BootstrapButtonEventMapOps[Self <: BootstrapButtonEventMap] (val x: Self) extends AnyVal {
    
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
    def setCheckedChanged(value: ProcessingModeEventArgs): Self = this.set("checkedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: ButtonClickEventArgs): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGotFocus(value: EventArgs): Self = this.set("gotFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLostFocus(value: EventArgs): Self = this.set("lostFocus", value.asInstanceOf[js.Any])
  }
}
