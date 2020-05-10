package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsOptions extends js.Object {
  var advanced: js.UndefOr[StockToolsGuiDefinitionsAdvancedOptions] = js.native
  var crookedLines: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesOptions] = js.native
  var currentPriceIndicator: js.UndefOr[StockToolsGuiDefinitionsCurrentPriceIndicatorOptions] = js.native
  var flags: js.UndefOr[StockToolsGuiDefinitionsFlagsOptions] = js.native
  var fullScreen: js.UndefOr[StockToolsGuiDefinitionsFullScreenOptions] = js.native
  var indicators: js.UndefOr[StockToolsGuiDefinitionsIndicatorsOptions] = js.native
  var lines: js.UndefOr[StockToolsGuiDefinitionsLinesOptions] = js.native
  var measure: js.UndefOr[StockToolsGuiDefinitionsMeasureOptions] = js.native
  var saveChart: js.UndefOr[StockToolsGuiDefinitionsSaveChartOptions] = js.native
  var separator: js.UndefOr[StockToolsGuiDefinitionsSeparatorOptions] = js.native
  var simpleShapes: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesOptions] = js.native
  var toggleAnnotations: js.UndefOr[StockToolsGuiDefinitionsToggleAnnotationsOptions] = js.native
  var typeChange: js.UndefOr[StockToolsGuiDefinitionsTypeChangeOptions] = js.native
  var verticalLabels: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsOptions] = js.native
  var zoomChange: js.UndefOr[StockToolsGuiDefinitionsZoomChangeOptions] = js.native
}

object StockToolsGuiDefinitionsOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsOptionsOps[Self <: StockToolsGuiDefinitionsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanced(value: StockToolsGuiDefinitionsAdvancedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvanced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(js.undefined)
        ret
    }
    @scala.inline
    def withCrookedLines(value: StockToolsGuiDefinitionsCrookedLinesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crookedLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrookedLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crookedLines")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPriceIndicator(value: StockToolsGuiDefinitionsCurrentPriceIndicatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPriceIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPriceIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPriceIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: StockToolsGuiDefinitionsFlagsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: StockToolsGuiDefinitionsFullScreenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicators(value: StockToolsGuiDefinitionsIndicatorsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: StockToolsGuiDefinitionsLinesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasure(value: StockToolsGuiDefinitionsMeasureOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveChart(value: StockToolsGuiDefinitionsSaveChartOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChart")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: StockToolsGuiDefinitionsSeparatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleShapes(value: StockToolsGuiDefinitionsSimpleShapesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleAnnotations(value: StockToolsGuiDefinitionsToggleAnnotationsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeChange(value: StockToolsGuiDefinitionsTypeChangeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLabels(value: StockToolsGuiDefinitionsVerticalLabelsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomChange(value: StockToolsGuiDefinitionsZoomChangeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChange")(js.undefined)
        ret
    }
  }
  
}

