package typingsSlinky.baseui.sideNavigationMod

import typingsSlinky.baseui.anon.ItemAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavItemProps extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.native
  @JSName("$level")
  var $level: js.UndefOr[Double] = js.native
  @JSName("$selectable")
  var $selectable: js.UndefOr[Boolean] = js.native
  var item: Item = js.native
  var onSelect: js.UndefOr[js.Function1[/* args */ ItemAny, _]] = js.native
  var overrides: js.UndefOr[NavItemOverrides] = js.native
}

object NavItemProps {
  @scala.inline
  def apply(item: Item): NavItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemProps]
  }
  @scala.inline
  implicit class NavItemPropsOps[Self <: NavItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$active(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$active: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$active")(js.undefined)
        ret
    }
    @scala.inline
    def with$level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$level")(js.undefined)
        ret
    }
    @scala.inline
    def with$selectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$selectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* args */ ItemAny => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: NavItemOverrides): Self = {
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

