package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisRangeChangedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to current chart axis object.
  	 */
  var axis: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get new maximum value.
  	 */
  var newMaximumValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get new minimum value.
  	 */
  var newMinimumValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get old maximum value.
  	 */
  var oldMaximumValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get old minimum value.
  	 */
  var oldMinimumValue: js.UndefOr[js.Any] = js.native
}

object AxisRangeChangedEventUIParam {
  @scala.inline
  def apply(): AxisRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisRangeChangedEventUIParam]
  }
  @scala.inline
  implicit class AxisRangeChangedEventUIParamOps[Self <: AxisRangeChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withChart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withNewMaximumValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMaximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMaximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNewMinimumValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMinimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMinimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOldMaximumValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMaximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMaximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOldMinimumValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMinimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMinimumValue")(js.undefined)
        ret
    }
  }
  
}

