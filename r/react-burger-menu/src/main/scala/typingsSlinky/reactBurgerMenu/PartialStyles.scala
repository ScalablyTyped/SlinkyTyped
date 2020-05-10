package typingsSlinky.reactBurgerMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-burger-menu.react-burger-menu.Styles> */
@js.native
trait PartialStyles extends js.Object {
  var bmBurgerBars: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmBurgerButton: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmCross: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmCrossButton: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmItemList: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmMenu: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmMenuWrap: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmMorphShape: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmOverlay: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}

object PartialStyles {
  @scala.inline
  def apply(): PartialStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyles]
  }
  @scala.inline
  implicit class PartialStylesOps[Self <: PartialStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBmBurgerBars(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmBurgerBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmBurgerBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmBurgerBars")(js.undefined)
        ret
    }
    @scala.inline
    def withBmBurgerButton(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmBurgerButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmBurgerButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmBurgerButton")(js.undefined)
        ret
    }
    @scala.inline
    def withBmCross(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmCross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmCross: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmCross")(js.undefined)
        ret
    }
    @scala.inline
    def withBmCrossButton(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmCrossButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmCrossButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmCrossButton")(js.undefined)
        ret
    }
    @scala.inline
    def withBmItemList(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmItemList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmItemList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmItemList")(js.undefined)
        ret
    }
    @scala.inline
    def withBmMenu(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withBmMenuWrap(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMenuWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmMenuWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMenuWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withBmMorphShape(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMorphShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmMorphShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMorphShape")(js.undefined)
        ret
    }
    @scala.inline
    def withBmOverlay(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmOverlay")(js.undefined)
        ret
    }
  }
  
}

