package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.False
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchProps extends SwitchPropsIOS {
  /**
    * If true the user won't be able to toggle the switch.
    * Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * On iOS, custom color for the background.
    * Can be seen when the switch value is false or when the switch is disabled.
    */
  var ios_backgroundColor: js.UndefOr[String] = js.native
  /**
    * Invoked with the new value when the value changes.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.native
  /**
    * Color of the foreground switch grip.
    */
  var thumbColor: js.UndefOr[String] = js.native
  /**
    * Custom colors for the switch track
    *
    * Color when false and color when true
    */
  var trackColor: js.UndefOr[False] = js.native
  /**
    * The value of the switch. If true the switch will be turned on.
    * Default value is false.
    */
  var value: js.UndefOr[Boolean] = js.native
}

object SwitchProps {
  @scala.inline
  def apply(): SwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchProps]
  }
  @scala.inline
  implicit class SwitchPropsOps[Self <: SwitchProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIos_backgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos_backgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: /* value */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackColor(value: False): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackColor")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

