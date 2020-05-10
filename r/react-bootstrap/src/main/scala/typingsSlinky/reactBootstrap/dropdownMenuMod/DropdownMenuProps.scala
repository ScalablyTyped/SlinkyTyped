package typingsSlinky.reactBootstrap.dropdownMenuMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownMenuProps
  extends AllHTMLAttributes[DropdownMenu]
     with ClassAttributes[DropdownMenu] {
  var labelledBy: js.UndefOr[String | Double] = js.native
  var onClose: js.UndefOr[js.Function] = js.native
  @JSName("onSelect")
  var onSelect_DropdownMenuProps: js.UndefOr[SelectCallback] = js.native
  var pullRight: js.UndefOr[Boolean] = js.native
}

object DropdownMenuProps {
  @scala.inline
  def apply(): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownMenuProps]
  }
  @scala.inline
  implicit class DropdownMenuPropsOps[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelledBy(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: SelectCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRight")(js.undefined)
        ret
    }
  }
  
}

