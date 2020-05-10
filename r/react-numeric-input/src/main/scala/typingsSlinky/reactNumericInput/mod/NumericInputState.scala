package typingsSlinky.reactNumericInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Exposed here for the function prop handlers that get the NumericInput instance as a parameter.
// Lifted directly from react-numeric-input@79874ccbe:/src/NumericInput.jsx#L63-L73
@js.native
trait NumericInputState extends js.Object {
  var btnDownActive: js.UndefOr[Boolean] = js.native
  var btnDownHover: js.UndefOr[Boolean] = js.native
  var btnUpActive: js.UndefOr[Boolean] = js.native
  var btnUpHover: js.UndefOr[Boolean] = js.native
  var selectionEnd: js.UndefOr[Double | Null] = js.native
  var selectionStart: js.UndefOr[Double | Null] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double | Null] = js.native
}

object NumericInputState {
  @scala.inline
  def apply(): NumericInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericInputState]
  }
  @scala.inline
  implicit class NumericInputStateOps[Self <: NumericInputState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnDownActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnDownActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnDownActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnDownActive")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnDownHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnDownHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnDownHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnDownHover")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnUpActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnUpActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnUpActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnUpActive")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnUpHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnUpHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnUpHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnUpHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(null)
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(null)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
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
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

