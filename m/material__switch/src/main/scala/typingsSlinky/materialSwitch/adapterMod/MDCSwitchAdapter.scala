package typingsSlinky.materialSwitch.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSwitchAdapter extends js.Object {
  /**
    * Adds a CSS class to the root element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Removes a CSS class from the root element.
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets checked state of the native HTML control underlying the switch.
    */
  def setNativeControlChecked(checked: Boolean): Unit = js.native
  /**
    * Sets the disabled state of the native HTML control underlying the switch.
    */
  def setNativeControlDisabled(disabled: Boolean): Unit = js.native
}

object MDCSwitchAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    removeClass: String => Unit,
    setNativeControlChecked: Boolean => Unit,
    setNativeControlDisabled: Boolean => Unit
  ): MDCSwitchAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), setNativeControlChecked = js.Any.fromFunction1(setNativeControlChecked), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
    __obj.asInstanceOf[MDCSwitchAdapter]
  }
  @scala.inline
  implicit class MDCSwitchAdapterOps[Self <: MDCSwitchAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNativeControlChecked(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeControlChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNativeControlDisabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeControlDisabled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

