package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultValue extends js.Object {
  var defaultValue: Double = js.native
  var disabled: Boolean = js.native
  def onAfterChange(): Unit = js.native
  def onChange(): Unit = js.native
}

object AnonDefaultValue {
  @scala.inline
  def apply(defaultValue: Double, disabled: Boolean, onAfterChange: () => Unit, onChange: () => Unit): AnonDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onAfterChange = js.Any.fromFunction0(onAfterChange), onChange = js.Any.fromFunction0(onChange))
    __obj.asInstanceOf[AnonDefaultValue]
  }
  @scala.inline
  implicit class AnonDefaultValueOps[Self <: AnonDefaultValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAfterChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

