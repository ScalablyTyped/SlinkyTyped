package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNativeMaterialKit.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKRangeSliderProperties extends BaseSlider {
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.native
  var onConfirm: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.native
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
}

object MKRangeSliderProperties {
  @scala.inline
  def apply(): MKRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRangeSliderProperties]
  }
  @scala.inline
  implicit class MKRangeSliderPropertiesOps[Self <: MKRangeSliderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* curValue */ Max => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConfirm(value: /* curValue */ Max => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
  }
  
}

