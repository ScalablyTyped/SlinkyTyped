package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaCloseSkipLink extends js.Object {
  var ariaCloseSkipLink: js.UndefOr[String] = js.native
  var ariaFocusSkipLink: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusFirstFocusable: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusFirstFocusableTouch: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusNone: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusNoneTouch: js.UndefOr[String] = js.native
}

object AriaCloseSkipLink {
  @scala.inline
  def apply(): AriaCloseSkipLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaCloseSkipLink]
  }
  @scala.inline
  implicit class AriaCloseSkipLinkOps[Self <: AriaCloseSkipLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaCloseSkipLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCloseSkipLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaCloseSkipLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCloseSkipLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaFocusSkipLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaFocusSkipLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaFocusSkipLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaFocusSkipLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLiveRegionInitialFocusFirstFocusable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusFirstFocusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLiveRegionInitialFocusFirstFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusFirstFocusable")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLiveRegionInitialFocusFirstFocusableTouch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusFirstFocusableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLiveRegionInitialFocusFirstFocusableTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusFirstFocusableTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLiveRegionInitialFocusNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLiveRegionInitialFocusNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusNone")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLiveRegionInitialFocusNoneTouch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusNoneTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLiveRegionInitialFocusNoneTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegionInitialFocusNoneTouch")(js.undefined)
        ret
    }
  }
  
}

