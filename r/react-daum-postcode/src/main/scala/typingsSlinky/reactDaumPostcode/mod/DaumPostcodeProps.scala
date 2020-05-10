package typingsSlinky.reactDaumPostcode.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaumPostcodeProps extends js.Object {
  var alwaysShowEngAddr: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[Boolean] = js.native
  var autoClose: js.UndefOr[Boolean] = js.native
  var autoMapping: js.UndefOr[Boolean] = js.native
  var autoResize: js.UndefOr[Boolean] = js.native
  var defaultQuery: js.UndefOr[String] = js.native
  var errorMessage: js.UndefOr[ReactElement] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hideEngBtn: js.UndefOr[Boolean] = js.native
  var hideMapBtn: js.UndefOr[Boolean] = js.native
  var maxSuggestItems: js.UndefOr[Double] = js.native
  var pleaseReadGuide: js.UndefOr[Double] = js.native
  var pleaseReadGuideTimer: js.UndefOr[Double] = js.native
  var scriptUrl: js.UndefOr[String] = js.native
  var shorthand: js.UndefOr[Boolean] = js.native
  var showMoreHName: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var submitMode: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[js.Object] = js.native
  var useSuggest: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var zonecodeOnly: js.UndefOr[Boolean] = js.native
  def onComplete(data: AddressData): Unit = js.native
}

object DaumPostcodeProps {
  @scala.inline
  def apply(onComplete: AddressData => Unit): DaumPostcodeProps = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[DaumPostcodeProps]
  }
  @scala.inline
  implicit class DaumPostcodePropsOps[Self <: DaumPostcodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: AddressData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlwaysShowEngAddr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowEngAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowEngAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowEngAddr")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEngBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEngBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEngBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEngBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMapBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMapBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMapBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMapBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSuggestItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSuggestItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestItems")(js.undefined)
        ret
    }
    @scala.inline
    def withPleaseReadGuide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pleaseReadGuide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPleaseReadGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pleaseReadGuide")(js.undefined)
        ret
    }
    @scala.inline
    def withPleaseReadGuideTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pleaseReadGuideTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPleaseReadGuideTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pleaseReadGuideTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShorthand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShorthand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthand")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMoreHName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMoreHName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMoreHName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMoreHName")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSuggest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSuggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSuggest")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZonecodeOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zonecodeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZonecodeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zonecodeOnly")(js.undefined)
        ret
    }
  }
  
}

