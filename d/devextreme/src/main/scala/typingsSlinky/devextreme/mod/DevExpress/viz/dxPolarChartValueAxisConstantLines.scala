package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartValueAxisConstantLines extends dxPolarChartCommonAxisSettingsConstantLineStyle {
  /** Specifies whether to display the constant line behind or in front of the series. */
  var displayBehindSeries: js.UndefOr[Boolean] = js.native
  /** Specifies whether to extend the axis to display the constant line. */
  var extendAxis: js.UndefOr[Boolean] = js.native
  /** An object defining constant line label options. */
  @JSName("label")
  var label_dxPolarChartValueAxisConstantLines: js.UndefOr[dxPolarChartValueAxisConstantLinesLabel] = js.native
  /** Specifies a value to be displayed by a constant line. */
  var value: js.UndefOr[Double | js.Date | String] = js.native
}

object dxPolarChartValueAxisConstantLines {
  @scala.inline
  def apply(): dxPolarChartValueAxisConstantLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxisConstantLines]
  }
  @scala.inline
  implicit class dxPolarChartValueAxisConstantLinesOps[Self <: dxPolarChartValueAxisConstantLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayBehindSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBehindSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayBehindSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBehindSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxPolarChartValueAxisConstantLinesLabel): Self = {
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
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | js.Date | String): Self = {
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

