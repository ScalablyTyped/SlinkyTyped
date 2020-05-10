package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.googleVisualizationStrings.exponential
import typingsSlinky.googleVisualization.googleVisualizationStrings.linear
import typingsSlinky.googleVisualization.googleVisualizationStrings.polynomial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTrendlineOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var degree: js.UndefOr[Double] = js.native
  var labelInLegend: js.UndefOr[String] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var pointsVisible: js.UndefOr[Boolean] = js.native
  var showR2: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[linear | exponential | polynomial] = js.native
  var visibleInLegend: js.UndefOr[Boolean] = js.native
}

object ChartTrendlineOptions {
  @scala.inline
  def apply(): ChartTrendlineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineOptions]
  }
  @scala.inline
  implicit class ChartTrendlineOptionsOps[Self <: ChartTrendlineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(js.undefined)
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
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
    def withShowR2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showR2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowR2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showR2")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: linear | exponential | polynomial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

