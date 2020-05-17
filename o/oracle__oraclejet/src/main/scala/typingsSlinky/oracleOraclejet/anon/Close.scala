package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Close extends js.Object {
  var close: Scaling = js.native
  var group: TooltipDisplay = js.native
  var high: Scaling = js.native
  var label: ConverterScaling = js.native
  var low: Scaling = js.native
  var open: Scaling = js.native
  var q1: Scaling = js.native
  var q2: Scaling = js.native
  var q3: Scaling = js.native
  var series: TooltipLabel = js.native
  var targetValue: Scaling = js.native
  var value: Scaling = js.native
  var volume: Scaling = js.native
  var x: Scaling = js.native
  var y: Scaling = js.native
  var y2: Scaling = js.native
  var z: Scaling = js.native
}

object Close {
  @scala.inline
  def apply(
    close: Scaling,
    group: TooltipDisplay,
    high: Scaling,
    label: ConverterScaling,
    low: Scaling,
    open: Scaling,
    q1: Scaling,
    q2: Scaling,
    q3: Scaling,
    series: TooltipLabel,
    targetValue: Scaling,
    value: Scaling,
    volume: Scaling,
    x: Scaling,
    y: Scaling,
    y2: Scaling,
    z: Scaling
  ): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q2 = q2.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: TooltipDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHigh(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: ConverterScaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ1(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ2(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ3(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: TooltipLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetValue(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Scaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

