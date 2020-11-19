package typingsSlinky.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuSettings extends js.Object {
  
  var devtools: js.UndefOr[Boolean] = js.native
  
  var enable: Boolean = js.native
  
  var reload: js.UndefOr[Boolean] = js.native
}
object ContextMenuSettings {
  
  @scala.inline
  def apply(enable: Boolean): ContextMenuSettings = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuSettings]
  }
  
  @scala.inline
  implicit class ContextMenuSettingsOps[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtools(value: Boolean): Self = this.set("devtools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtools: Self = this.set("devtools", js.undefined)
    
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
  }
}
