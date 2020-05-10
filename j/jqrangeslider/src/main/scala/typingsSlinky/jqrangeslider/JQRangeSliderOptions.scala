package typingsSlinky.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQRangeSliderOptions extends js.Object {
   // speed of the wheel scrolling
  var arrows: js.UndefOr[Boolean] = js.native
   // fade out length when displaying value labels (only when valueLabels = "change")
  var delayOut: js.UndefOr[Double] = js.native
   // when to show value labels: "show" (always), "hide" (never) and "change" (only if slider changed)
  var durationIn: js.UndefOr[Double] = js.native
   // fade in length when displaying value labels (only when valueLabels = "change")
  var durationOut: js.UndefOr[Double] = js.native
   // show handles and make them clearly select the range. Warning: must be used with 'minimum' and must not be used with 'scale'
  var enabled: js.UndefOr[Boolean] = js.native
   // duration labels are shown after the user changed its values (only when valueLabels = "change")
  var range: js.UndefOr[Boolean | JQRangeSliderRangeLength] = js.native
   // configure a read-only slider
  var scales: js.UndefOr[js.Array[jQRangeSliderScale]] = js.native
   // lets you specify minimum and/or maximum range length
  var symmetricPositionning: js.UndefOr[Boolean] = js.native
   // hide the arrows or not
  var valueLabels: js.UndefOr[String] = js.native
  var wheelMode: js.UndefOr[String] = js.native
   // function of the wheel, "zoom", "scroll" or null
  var wheelSpeed: js.UndefOr[Double] = js.native
}

object JQRangeSliderOptions {
  @scala.inline
  def apply(): JQRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderOptions]
  }
  @scala.inline
  implicit class JQRangeSliderOptionsOps[Self <: JQRangeSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationIn")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationOut")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Boolean | JQRangeSliderRangeLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withScales(value: js.Array[jQRangeSliderScale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(js.undefined)
        ret
    }
    @scala.inline
    def withSymmetricPositionning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symmetricPositionning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymmetricPositionning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symmetricPositionning")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLabels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelSpeed")(js.undefined)
        ret
    }
  }
  
}

