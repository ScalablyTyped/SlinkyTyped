package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart3dOptions extends js.Object {
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Set it to `"auto"` to automatically move the labels to the
    * best edge.
    */
  var axisLabelPosition: js.UndefOr[auto | Null] = js.native
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var beta: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The total depth of the chart.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Wether to render the chart using the 3D functionality.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether the 3d box should automatically adjust to the chart
    * plot area.
    */
  var fitToPlot: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Provides the option to draw a frame around the charts by
    * defining a bottom, front and back panel.
    */
  var frame: js.UndefOr[Chart3dFrameOptions] = js.native
  /**
    * (Highcharts) Defines the distance the viewer is standing in front of the
    * chart, this setting is important to calculate the perspective effect in
    * column and scatter charts. It is not used for 3D pie charts.
    */
  var viewDistance: js.UndefOr[Double] = js.native
}

object Chart3dOptions {
  @scala.inline
  def apply(): Chart3dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dOptions]
  }
  @scala.inline
  implicit class Chart3dOptionsOps[Self <: Chart3dOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabelPosition(value: auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabelPositionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelPosition")(null)
        ret
    }
    @scala.inline
    def withBeta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
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
    def withFitToPlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitToPlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPlot")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: Chart3dFrameOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withViewDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDistance")(js.undefined)
        ret
    }
  }
  
}

