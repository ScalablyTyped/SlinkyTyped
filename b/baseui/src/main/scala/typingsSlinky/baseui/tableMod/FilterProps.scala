package typingsSlinky.baseui.tableMod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var children: TagMod[Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var onReset: js.UndefOr[js.Function0[_]] = js.native
  var onSelectAll: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[Content] = js.native
}

object FilterProps {
  @scala.inline
  def apply(): FilterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterProps]
  }
  @scala.inline
  implicit class FilterPropsOps[Self <: FilterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAll(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

