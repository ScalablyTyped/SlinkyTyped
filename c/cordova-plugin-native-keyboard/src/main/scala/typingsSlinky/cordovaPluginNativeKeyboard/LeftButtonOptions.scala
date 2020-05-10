package typingsSlinky.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftButtonOptions extends ButtonOptions {
  /**
    * Set to true to disable the button once text has been entered.
    *
    * Default: false
    */
  var disabledWhenTextEntered: js.UndefOr[Boolean] = js.native
}

object LeftButtonOptions {
  @scala.inline
  def apply(color: String, onPress: () => Unit): LeftButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[LeftButtonOptions]
  }
  @scala.inline
  implicit class LeftButtonOptionsOps[Self <: LeftButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledWhenTextEntered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledWhenTextEntered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledWhenTextEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledWhenTextEntered")(js.undefined)
        ret
    }
  }
  
}

