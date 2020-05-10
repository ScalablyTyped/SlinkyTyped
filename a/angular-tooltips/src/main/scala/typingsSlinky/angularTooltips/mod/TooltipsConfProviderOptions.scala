package typingsSlinky.angularTooltips.mod

import typingsSlinky.angularTooltips.angularTooltipsStrings.`bottom left`
import typingsSlinky.angularTooltips.angularTooltipsStrings.`bottom right`
import typingsSlinky.angularTooltips.angularTooltipsStrings.`top left`
import typingsSlinky.angularTooltips.angularTooltipsStrings.`top right`
import typingsSlinky.angularTooltips.angularTooltipsStrings.bottom
import typingsSlinky.angularTooltips.angularTooltipsStrings.fast
import typingsSlinky.angularTooltips.angularTooltipsStrings.large
import typingsSlinky.angularTooltips.angularTooltipsStrings.left
import typingsSlinky.angularTooltips.angularTooltipsStrings.medium
import typingsSlinky.angularTooltips.angularTooltipsStrings.right
import typingsSlinky.angularTooltips.angularTooltipsStrings.slow
import typingsSlinky.angularTooltips.angularTooltipsStrings.small
import typingsSlinky.angularTooltips.angularTooltipsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipsConfProviderOptions extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var hideTrigger: js.UndefOr[String] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var showTrigger: js.UndefOr[String] = js.native
  var side: js.UndefOr[
    left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
  ] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
  var smart: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var tooltipTemplateUrlCache: js.UndefOr[Boolean] = js.native
}

object TooltipsConfProviderOptions {
  @scala.inline
  def apply(): TooltipsConfProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipsConfProviderOptions]
  }
  @scala.inline
  implicit class TooltipsConfProviderOptionsOps[Self <: TooltipsConfProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(
      value: left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large): Self = {
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
    @scala.inline
    def withSmart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: slow | medium | fast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplateUrlCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplateUrlCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplateUrlCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplateUrlCache")(js.undefined)
        ret
    }
  }
  
}

