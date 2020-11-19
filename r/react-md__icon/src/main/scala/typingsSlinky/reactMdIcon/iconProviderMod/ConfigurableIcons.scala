package typingsSlinky.reactMdIcon.iconProviderMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurableIcons extends js.Object {
  
  /**
    * The general icon for navigating backwards or closing an item to the left.
    */
  var back: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon to use for checkboxes.
    */
  var checkbox: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon to use for downloading content.
    */
  var download: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon to use for dropdown menus or content that expands
    * vertically in a new material instead of inline like the `expander` icon.
    */
  var dropdown: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon to use for expanding content vertically.
    */
  var expander: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon for navigating forwards or closing an item to the right.
    * This is also used internally for nested dropdown menus.
    */
  var forward: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon to use for displaying a main navigation menu.
    */
  var menu: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon for displaying notifications. This is used internally in
    * the `BadgedButton` in the `@react-md/badge` package.
    */
  var notification: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon for temporarily displaying a password's field value as
    * plain text.
    */
  var password: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon to use for radio buttons.
    */
  var radio: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon to use for showing that something has been selected that
    * is not a radio or checkbox. This is used internally for the `Chip` in the
    * `@react-md/chip` package.
    */
  var selected: js.UndefOr[ReactElement] = js.native
  
  /**
    * The general icon for sorting content. This defaults to the sort ascending
    * behavior.
    */
  var sort: js.UndefOr[ReactElement] = js.native
}
object ConfigurableIcons {
  
  @scala.inline
  def apply(): ConfigurableIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurableIcons]
  }
  
  @scala.inline
  implicit class ConfigurableIconsOps[Self <: ConfigurableIcons] (val x: Self) extends AnyVal {
    
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
    def setBackReactElement(value: ReactElement): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack(value: ReactElement): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    
    @scala.inline
    def setCheckboxReactElement(value: ReactElement): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckbox(value: ReactElement): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    
    @scala.inline
    def setDownloadReactElement(value: ReactElement): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload(value: ReactElement): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDropdownReactElement(value: ReactElement): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: ReactElement): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    
    @scala.inline
    def setExpanderReactElement(value: ReactElement): Self = this.set("expander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpander(value: ReactElement): Self = this.set("expander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpander: Self = this.set("expander", js.undefined)
    
    @scala.inline
    def setForwardReactElement(value: ReactElement): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: ReactElement): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    
    @scala.inline
    def setMenuReactElement(value: ReactElement): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: ReactElement): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setNotificationReactElement(value: ReactElement): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: ReactElement): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setPasswordReactElement(value: ReactElement): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: ReactElement): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRadioReactElement(value: ReactElement): Self = this.set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadio(value: ReactElement): Self = this.set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadio: Self = this.set("radio", js.undefined)
    
    @scala.inline
    def setSelectedReactElement(value: ReactElement): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: ReactElement): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSortReactElement(value: ReactElement): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: ReactElement): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
