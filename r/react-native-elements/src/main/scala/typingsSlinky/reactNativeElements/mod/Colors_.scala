package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNativeElements.AnonAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors_ extends js.Object {
  val disabled: String = js.native
  val divider: String = js.native
  val error: String = js.native
  val grey0: String = js.native
  val grey1: String = js.native
  val grey2: String = js.native
  val grey3: String = js.native
  val grey4: String = js.native
  val grey5: String = js.native
  val greyOutline: String = js.native
  val platform: AnonAndroid = js.native
  val primary: String = js.native
  val searchBg: String = js.native
  val secondary: String = js.native
  val success: String = js.native
  val warning: String = js.native
}

object Colors_ {
  @scala.inline
  def apply(
    disabled: String,
    divider: String,
    error: String,
    grey0: String,
    grey1: String,
    grey2: String,
    grey3: String,
    grey4: String,
    grey5: String,
    greyOutline: String,
    platform: AnonAndroid,
    primary: String,
    searchBg: String,
    secondary: String,
    success: String,
    warning: String
  ): Colors_ = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], grey0 = grey0.asInstanceOf[js.Any], grey1 = grey1.asInstanceOf[js.Any], grey2 = grey2.asInstanceOf[js.Any], grey3 = grey3.asInstanceOf[js.Any], grey4 = grey4.asInstanceOf[js.Any], grey5 = grey5.asInstanceOf[js.Any], greyOutline = greyOutline.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], searchBg = searchBg.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors_]
  }
  @scala.inline
  implicit class Colors_Ops[Self <: Colors_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreyOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: AnonAndroid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

