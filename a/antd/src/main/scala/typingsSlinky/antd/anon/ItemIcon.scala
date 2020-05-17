package typingsSlinky.antd.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemIcon extends js.Object {
  var clearIcon: TagMod[Any] = js.native
  var itemIcon: js.Object | Null = js.native
  var removeIcon: js.Object | Null = js.native
  var suffixIcon: js.Object | Null = js.native
}

object ItemIcon {
  @scala.inline
  def apply(): ItemIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemIcon]
  }
  @scala.inline
  implicit class ItemIconOps[Self <: ItemIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withItemIcon(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(null)
        ret
    }
    @scala.inline
    def withRemoveIcon(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIcon")(null)
        ret
    }
    @scala.inline
    def withSuffixIcon(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(null)
        ret
    }
  }
  
}

