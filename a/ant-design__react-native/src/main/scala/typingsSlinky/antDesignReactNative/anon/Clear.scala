package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clear extends js.Object {
  var clear: Boolean = js.native
  var editable: Boolean = js.native
  var error: Boolean = js.native
  var extra: String = js.native
  var labelNumber: Double = js.native
  var labelPosition: String = js.native
  var last: Boolean = js.native
  var textAlign: String = js.native
  var `type`: String = js.native
  def onBlur(): Unit = js.native
  def onChange(): Unit = js.native
  def onErrorClick(): Unit = js.native
  def onExtraClick(): Unit = js.native
  def onFocus(): Unit = js.native
}

object Clear {
  @scala.inline
  def apply(
    clear: Boolean,
    editable: Boolean,
    error: Boolean,
    extra: String,
    labelNumber: Double,
    labelPosition: String,
    last: Boolean,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onExtraClick: () => Unit,
    onFocus: () => Unit,
    textAlign: String,
    `type`: String
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), textAlign = textAlign.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
  @scala.inline
  implicit class ClearOps[Self <: Clear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnErrorClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnExtraClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExtraClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

