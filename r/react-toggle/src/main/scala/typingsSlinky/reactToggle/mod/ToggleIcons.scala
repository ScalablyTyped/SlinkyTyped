package typingsSlinky.reactToggle.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleIcons extends js.Object {
  var checked: js.UndefOr[ReactElement] = js.native
  var unchecked: js.UndefOr[ReactElement] = js.native
}

object ToggleIcons {
  @scala.inline
  def apply(): ToggleIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleIcons]
  }
  @scala.inline
  implicit class ToggleIconsOps[Self <: ToggleIcons] (val x: Self) extends AnyVal {
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
    def setCheckedReactElement(value: ReactElement): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: ReactElement): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setUncheckedReactElement(value: ReactElement): Self = this.set("unchecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnchecked(value: ReactElement): Self = this.set("unchecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnchecked: Self = this.set("unchecked", js.undefined)
  }
  
}

