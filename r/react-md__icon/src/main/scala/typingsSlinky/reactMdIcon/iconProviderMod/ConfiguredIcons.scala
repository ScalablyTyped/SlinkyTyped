package typingsSlinky.reactMdIcon.iconProviderMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/icon.@react-md/icon/types/IconProvider.ConfigurableIcons> */
@js.native
trait ConfiguredIcons extends js.Object {
  
  var back: ReactElement = js.native
  
  var checkbox: ReactElement = js.native
  
  var download: ReactElement = js.native
  
  var dropdown: ReactElement = js.native
  
  var expander: ReactElement = js.native
  
  var forward: ReactElement = js.native
  
  var menu: ReactElement = js.native
  
  var notification: ReactElement = js.native
  
  var password: ReactElement = js.native
  
  var radio: ReactElement = js.native
  
  var selected: ReactElement = js.native
  
  var sort: ReactElement = js.native
}
object ConfiguredIcons {
  
  @scala.inline
  def apply(): ConfiguredIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfiguredIcons]
  }
  
  @scala.inline
  implicit class ConfiguredIconsOps[Self <: ConfiguredIcons] (val x: Self) extends AnyVal {
    
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
    def setBack(value: ReactElement): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    
    @scala.inline
    def setCheckbox(value: ReactElement): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    
    @scala.inline
    def setDownload(value: ReactElement): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDropdown(value: ReactElement): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    
    @scala.inline
    def setExpander(value: ReactElement): Self = this.set("expander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpander: Self = this.set("expander", js.undefined)
    
    @scala.inline
    def setForward(value: ReactElement): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    
    @scala.inline
    def setMenu(value: ReactElement): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setNotification(value: ReactElement): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setPassword(value: ReactElement): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRadio(value: ReactElement): Self = this.set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadio: Self = this.set("radio", js.undefined)
    
    @scala.inline
    def setSelected(value: ReactElement): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSort(value: ReactElement): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
