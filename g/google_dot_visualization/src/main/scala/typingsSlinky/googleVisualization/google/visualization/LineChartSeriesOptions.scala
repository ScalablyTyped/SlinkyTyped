package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.googleVisualizationStrings.function
import typingsSlinky.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineChartSeriesOptions extends ChartSeriesOptionsBase {
  var annotations: js.UndefOr[ChartAnnotations] = js.native
  var curveType: js.UndefOr[none | function] = js.native
  var labelInLegend: js.UndefOr[String] = js.native
  var lineDashStyle: js.UndefOr[js.Array[Double]] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var pointShape: js.UndefOr[ChartPointShape] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var pointsVisible: js.UndefOr[Boolean] = js.native
  var targetAxisIndex: js.UndefOr[Double] = js.native
  var visibleInLegend: js.UndefOr[Boolean] = js.native
}

object LineChartSeriesOptions {
  @scala.inline
  def apply(): LineChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartSeriesOptions]
  }
  @scala.inline
  implicit class LineChartSeriesOptionsOps[Self <: LineChartSeriesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: ChartAnnotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withCurveType(value: none | function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInLegend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashStyle(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPointShape(value: ChartPointShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointShape")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPointsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetAxisIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAxisIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInLegend")(js.undefined)
        ret
    }
  }
  
}

