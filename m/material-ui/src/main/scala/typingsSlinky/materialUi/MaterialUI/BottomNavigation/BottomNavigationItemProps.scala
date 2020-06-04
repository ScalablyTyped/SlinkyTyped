package typingsSlinky.materialUi.MaterialUI.BottomNavigation

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.materialUi.MaterialUI.SharedEnhancedButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationItemProps extends SharedEnhancedButtonProps[BottomNavigationItem] {
  var className: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var label: js.UndefOr[TagMod[Any]] = js.undefined
}

object BottomNavigationItemProps {
  @scala.inline
  def apply(): BottomNavigationItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomNavigationItemProps]
  }
  @scala.inline
  implicit class BottomNavigationItemPropsOps[Self <: BottomNavigationItemProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: TagMod[Any]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: TagMod[Any]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

