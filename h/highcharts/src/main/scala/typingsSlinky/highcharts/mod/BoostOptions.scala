package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoostOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If set to true, the whole chart
    * will be boosted if one of the series crosses its threshold, and all the
    * series can be boosted.
    */
  var allowForce: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost.
    * Useful for benchmarking, and general timing.
    */
  var debug: js.UndefOr[BoostDebugOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable boost on a
    * chart.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the series threshold for
    * when the boost should kick in globally.
    *
    * Setting to e.g. 20 will cause the whole chart to enter boost mode if
    * there are 20 or more series active. When the chart is in boost mode,
    * every series in it will be rendered to a common canvas. This offers a
    * significant speed improvment in charts with a very high amount of series.
    */
  var seriesThreshold: js.UndefOr[Double | Null] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable GPU
    * translations. GPU translations are faster than doing the translation in
    * JavaScript.
    *
    * This option may cause rendering issues with certain datasets. Namely, if
    * your dataset has large numbers with small increments (such as
    * timestamps), it won't work correctly. This is due to floating point
    * precission.
    */
  var useGPUTranslations: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable pre-allocation
    * of vertex buffers.
    *
    * Enabling this will make it so that the binary data arrays required for
    * storing the series data will be allocated prior to transforming the data
    * to a WebGL-compatible format.
    *
    * This saves a copy operation on the order of O(n) and so is significantly
    * more performant. However, this is currently an experimental option, and
    * may cause visual artifacts with some datasets.
    *
    * As such, care should be taken when using this setting to make sure that
    * it doesn't cause any rendering glitches with the given use-case.
    */
  var usePreallocated: js.UndefOr[Boolean] = js.native
}

object BoostOptions {
  @scala.inline
  def apply(): BoostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoostOptions]
  }
  @scala.inline
  implicit class BoostOptionsOps[Self <: BoostOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowForce")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: BoostDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
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
    def withSeriesThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesThresholdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesThreshold")(null)
        ret
    }
    @scala.inline
    def withUseGPUTranslations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGPUTranslations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGPUTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGPUTranslations")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePreallocated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreallocated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePreallocated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreallocated")(js.undefined)
        ret
    }
  }
  
}

