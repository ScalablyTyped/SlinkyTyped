package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChartOptions extends js.Object {
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.native
  var colorAxis: js.UndefOr[ChartColorAxis] = js.native
  var datalessRegionColor: js.UndefOr[String] = js.native
  var defaultColor: js.UndefOr[String] = js.native
  var displayMode: js.UndefOr[String] = js.native
  var enableRegionInteractivity: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var keepAspectRatio: js.UndefOr[Boolean] = js.native
  var legend: js.UndefOr[ChartLegend | none] = js.native
  var magnifyingGlass: js.UndefOr[GeoChartMagnifyingGlass] = js.native
  var markerOpacity: js.UndefOr[Double] = js.native
  var region: js.UndefOr[String] = js.native
  var resolution: js.UndefOr[String] = js.native
  var sizeAxis: js.UndefOr[ChartSizeAxis] = js.native
  var tooltip: js.UndefOr[ChartTooltip] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GeoChartOptions {
  @scala.inline
  def apply(): GeoChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoChartOptions]
  }
  @scala.inline
  implicit class GeoChartOptionsOps[Self <: GeoChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String | ChartStrokeFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColorAxis(value: ChartColorAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withDatalessRegionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datalessRegionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatalessRegionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datalessRegionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRegionInteractivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRegionInteractivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRegionInteractivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRegionInteractivity")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: ChartLegend | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withMagnifyingGlass(value: GeoChartMagnifyingGlass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnifyingGlass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagnifyingGlass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnifyingGlass")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeAxis(value: ChartSizeAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ChartTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

