package typingsSlinky.baseui.sideNavigationMod

import typingsSlinky.baseui.anon.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProps extends js.Object {
  var activeItemId: String = js.native
  var activePredicate: js.UndefOr[js.Function2[/* item */ js.Any, /* activeItemId */ String, Boolean]] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var mapItem: js.UndefOr[js.Function1[/* item */ Item, Item]] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ EventItem, _]] = js.native
  var overrides: js.UndefOr[NavigationOverrides] = js.native
}

object NavigationProps {
  @scala.inline
  def apply(activeItemId: String): NavigationProps = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProps]
  }
  @scala.inline
  implicit class NavigationPropsOps[Self <: NavigationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivePredicate(value: (/* item */ js.Any, /* activeItemId */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePredicate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivePredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMapItem(value: /* item */ Item => Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* args */ EventItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: NavigationOverrides): Self = {
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

