package typingsSlinky.reactToggle.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleIcons extends js.Object {
  var checked: js.UndefOr[TagMod[Any]] = js.native
  var unchecked: js.UndefOr[TagMod[Any]] = js.native
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
    def withCheckedReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnchecked(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnchecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchecked")(js.undefined)
        ret
    }
  }
  
}

