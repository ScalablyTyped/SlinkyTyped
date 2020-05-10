package typingsSlinky.reactBurgerMenu.mod

import typingsSlinky.reactBurgerMenu.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles extends js.Object {
  var bmBurgerBars: PartialCSSStyleDeclaratio = js.native
  var bmBurgerButton: PartialCSSStyleDeclaratio = js.native
  var bmCross: PartialCSSStyleDeclaratio = js.native
  var bmCrossButton: PartialCSSStyleDeclaratio = js.native
  var bmItemList: PartialCSSStyleDeclaratio = js.native
  var bmMenu: PartialCSSStyleDeclaratio = js.native
  var bmMenuWrap: PartialCSSStyleDeclaratio = js.native
  var bmMorphShape: PartialCSSStyleDeclaratio = js.native
  var bmOverlay: PartialCSSStyleDeclaratio = js.native
}

object Styles {
  @scala.inline
  def apply(
    bmBurgerBars: PartialCSSStyleDeclaratio,
    bmBurgerButton: PartialCSSStyleDeclaratio,
    bmCross: PartialCSSStyleDeclaratio,
    bmCrossButton: PartialCSSStyleDeclaratio,
    bmItemList: PartialCSSStyleDeclaratio,
    bmMenu: PartialCSSStyleDeclaratio,
    bmMenuWrap: PartialCSSStyleDeclaratio,
    bmMorphShape: PartialCSSStyleDeclaratio,
    bmOverlay: PartialCSSStyleDeclaratio
  ): Styles = {
    val __obj = js.Dynamic.literal(bmBurgerBars = bmBurgerBars.asInstanceOf[js.Any], bmBurgerButton = bmBurgerButton.asInstanceOf[js.Any], bmCross = bmCross.asInstanceOf[js.Any], bmCrossButton = bmCrossButton.asInstanceOf[js.Any], bmItemList = bmItemList.asInstanceOf[js.Any], bmMenu = bmMenu.asInstanceOf[js.Any], bmMenuWrap = bmMenuWrap.asInstanceOf[js.Any], bmMorphShape = bmMorphShape.asInstanceOf[js.Any], bmOverlay = bmOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
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
    def withBmBurgerButton(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmBurgerButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBmCross(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmCross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBmCrossButton(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmCrossButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBmItemList(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmItemList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBmMenu(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBmMenuWrap(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMenuWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBmMorphShape(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmMorphShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBmOverlay(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmOverlay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

