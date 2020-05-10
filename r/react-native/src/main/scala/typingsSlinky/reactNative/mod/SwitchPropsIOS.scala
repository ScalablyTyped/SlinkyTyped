package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchPropsIOS extends ViewProps {
  /**
    * Background color when the switch is turned on.
    *
    * @deprecated use trackColor instead
    */
  var onTintColor: js.UndefOr[String] = js.native
  /**
    * Color of the foreground switch grip.
    *
    * @deprecated use thumbColor instead
    */
  var thumbTintColor: js.UndefOr[String] = js.native
  /**
    * Background color when the switch is turned off.
    *
    * @deprecated use trackColor instead
    */
  var tintColor: js.UndefOr[String] = js.native
}

object SwitchPropsIOS {
  @scala.inline
  def apply(): SwitchPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchPropsIOS]
  }
  @scala.inline
  implicit class SwitchPropsIOSOps[Self <: SwitchPropsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
  }
  
}

