package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieRadarChartBase extends ChartBase {
  var minOffset: js.UndefOr[Double] = js.native
  var rotationAngle: js.UndefOr[Double] = js.native
  var rotationEnabled: js.UndefOr[Boolean] = js.native
}

object PieRadarChartBase {
  @scala.inline
  def apply(): PieRadarChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieRadarChartBase]
  }
  @scala.inline
  implicit class PieRadarChartBaseOps[Self <: PieRadarChartBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationEnabled")(js.undefined)
        ret
    }
  }
  
}

