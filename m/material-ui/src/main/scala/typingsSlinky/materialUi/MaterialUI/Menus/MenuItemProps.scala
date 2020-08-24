package typingsSlinky.materialUi.MaterialUI.Menus

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.materialUi.MaterialUI.List.ListItemProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps extends ListItemProps {
  // <ListItem/> is the element that get the 'other' properties
  var animation: js.UndefOr[ReactComponentClass[PopoverAnimationProps]] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  @JSName("containerElement")
  var containerElement_MenuItemProps: js.UndefOr[ReactElement | String] = js.native
  var desktop: js.UndefOr[Boolean] = js.native
  var focusState: js.UndefOr[String] = js.native
  var label: js.UndefOr[String | ReactElement] = js.native
  var menuItems: js.UndefOr[ReactElement] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
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
    def setAnimation(value: ReactComponentClass[PopoverAnimationProps]): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setContainerElementReactElement(value: ReactElement): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerElement(value: ReactElement | String): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerElement: Self = this.set("containerElement", js.undefined)
    @scala.inline
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setFocusState(value: String): Self = this.set("focusState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusState: Self = this.set("focusState", js.undefined)
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String | ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMenuItemsReactElement(value: ReactElement): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItems(value: ReactElement): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
  }
  
}

