package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisConfiguration extends js.Object {
  /**
    * Show the axis inside of the chart.
    */
  var inner: js.UndefOr[Boolean] = js.native
  /**
    * Set label on axis.
    * Valid horizontal axis positions: inner-right (default), inner-center, inner-left, outer-right, outer-center, outer-left
    * Valid vertical axis positions: inner-top, inner-middle, inner-bottom, outer-top, outer-middle, outer-bottom
    */
  var label: js.UndefOr[String | Position] = js.native
  /**
    * Set max value of the axis.
    */
  var max: js.UndefOr[String | Double | js.Date] = js.native
  /**
    * Set min value of the axis.
    */
  var min: js.UndefOr[String | Double | js.Date] = js.native
  /**
    * Set padding for axis.
    * If this option is set, the range of axis will increase/decrease according to the values. If no padding is needed in the range of axis, `0` should be set. On category axis, this option
    * will be ignored.
    */
  var padding: js.UndefOr[Padding] = js.native
  /**
    * Show or hide the axis.
    */
  var show: js.UndefOr[Boolean] = js.native
}

object AxisConfiguration {
  @scala.inline
  def apply(): AxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisConfiguration]
  }
  @scala.inline
  implicit class AxisConfigurationOps[Self <: AxisConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String | Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

