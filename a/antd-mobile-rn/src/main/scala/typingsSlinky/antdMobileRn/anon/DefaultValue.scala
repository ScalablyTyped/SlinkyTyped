package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultValue extends js.Object {
  var defaultValue: Double = js.native
  var disabled: Boolean = js.native
  var maximumTrackTintColor: String = js.native
  var minimumTrackTintColor: String = js.native
  def onAfterChange(): Unit = js.native
  def onChange(): Unit = js.native
}

object DefaultValue {
  @scala.inline
  def apply(
    defaultValue: Double,
    disabled: Boolean,
    maximumTrackTintColor: String,
    minimumTrackTintColor: String,
    onAfterChange: () => Unit,
    onChange: () => Unit
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any], minimumTrackTintColor = minimumTrackTintColor.asInstanceOf[js.Any], onAfterChange = js.Any.fromFunction0(onAfterChange), onChange = js.Any.fromFunction0(onChange))
    __obj.asInstanceOf[DefaultValue]
  }
  @scala.inline
  implicit class DefaultValueOps[Self <: DefaultValue] (val x: Self) extends AnyVal {
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
    def withMaximumTrackTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTrackTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumTrackTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTrackTintColor")(value.asInstanceOf[js.Any])
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

