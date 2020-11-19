package typingsSlinky.reactMdTabs.panelGroupMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelGroupProps extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var disableTransition: Boolean = js.native
  
  var persistent: Boolean = js.native
}
object PanelGroupProps {
  
  @scala.inline
  def apply(disableTransition: Boolean, persistent: Boolean): PanelGroupProps = {
    val __obj = js.Dynamic.literal(disableTransition = disableTransition.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelGroupProps]
  }
  
  @scala.inline
  implicit class PanelGroupPropsOps[Self <: PanelGroupProps] (val x: Self) extends AnyVal {
    
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
    def setDisableTransition(value: Boolean): Self = this.set("disableTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
