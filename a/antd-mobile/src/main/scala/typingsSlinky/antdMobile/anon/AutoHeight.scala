package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoHeight extends js.Object {
  var autoHeight: Boolean = js.native
  var clear: Boolean = js.native
  var disabled: Boolean = js.native
  var editable: Boolean = js.native
  var error: Boolean = js.native
  var labelNumber: Double = js.native
  var onBlur: js.Function0[Unit] = js.native
  var onChange: js.Function0[Unit] = js.native
  var onErrorClick: js.Function0[Unit] = js.native
  var onFocus: js.Function0[Unit] = js.native
  var placeholder: String = js.native
  var prefixCls: String = js.native
  var prefixListCls: String = js.native
  var rows: Double = js.native
}

object AutoHeight {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    clear: Boolean,
    disabled: Boolean,
    editable: Boolean,
    error: Boolean,
    labelNumber: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onFocus: () => Unit,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    rows: Double
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onFocus = js.Any.fromFunction0(onFocus), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prefixListCls = prefixListCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHeight]
  }
  @scala.inline
  implicit class AutoHeightOps[Self <: AutoHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
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
    def withLabelNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNumber")(value.asInstanceOf[js.Any])
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
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixListCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

