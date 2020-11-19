package typingsSlinky.antDesignProLayout.libSettingDrawerMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingItemProps extends js.Object {
  
  var action: ReactElement = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var disabledReason: js.UndefOr[ReactElement] = js.native
  
  var title: ReactElement = js.native
}
object SettingItemProps {
  
  @scala.inline
  def apply(action: ReactElement): SettingItemProps = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingItemProps]
  }
  
  @scala.inline
  implicit class SettingItemPropsOps[Self <: SettingItemProps] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledReasonReactElement(value: ReactElement): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledReason(value: ReactElement): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledReason: Self = this.set("disabledReason", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
