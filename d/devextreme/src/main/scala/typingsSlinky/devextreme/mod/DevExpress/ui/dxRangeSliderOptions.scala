package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxRangeSliderOptions extends dxSliderBaseOptions[dxRangeSlider] {
  /** The right edge of the interval currently selected using the range slider. */
  var end: js.UndefOr[Double] = js.native
  /** The value to be assigned to the name attribute of the underlying `` element. */
  var endName: js.UndefOr[String] = js.native
  /** A function that is executed after the widget's value is changed. */
  @JSName("onValueChanged")
  var onValueChanged_dxRangeSliderOptions: js.UndefOr[js.Function1[/* e */ AnonEnd, _]] = js.native
  /** The left edge of the interval currently selected using the range slider. */
  var start: js.UndefOr[Double] = js.native
  /** The value to be assigned to the name attribute of the underlying `` element. */
  var startName: js.UndefOr[String] = js.native
  /** Specifies the widget's value. */
  @JSName("value")
  var value_dxRangeSliderOptions: js.UndefOr[js.Array[Double]] = js.native
}

object dxRangeSliderOptions {
  @scala.inline
  def apply(): dxRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRangeSliderOptions]
  }
  @scala.inline
  implicit class dxRangeSliderOptionsOps[Self <: dxRangeSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEndName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* e */ AnonEnd => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStartName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startName")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[Double]): Self = {
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

