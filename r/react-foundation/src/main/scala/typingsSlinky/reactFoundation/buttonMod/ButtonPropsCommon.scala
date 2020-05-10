package typingsSlinky.reactFoundation.buttonMod

import typingsSlinky.reactFoundation.enumsMod.ButtonSizes
import typingsSlinky.reactFoundation.utilsMod.FlexboxPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonPropsCommon extends FlexboxPropTypes {
  var isArrowOnly: js.UndefOr[Boolean] = js.native
  var isDisabled: js.UndefOr[Boolean] = js.native
  var isDropdown: js.UndefOr[Boolean] = js.native
  var isExpanded: js.UndefOr[Boolean] = js.native
  var isHollow: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[ButtonSizes] = js.native
}

object ButtonPropsCommon {
  @scala.inline
  def apply(): ButtonPropsCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonPropsCommon]
  }
  @scala.inline
  implicit class ButtonPropsCommonOps[Self <: ButtonPropsCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsArrowOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArrowOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArrowOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArrowOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDropdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHollow")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: ButtonSizes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

