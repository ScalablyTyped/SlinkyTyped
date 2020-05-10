package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.mod.DevExpress.viz.ChartSeries
import typingsSlinky.devextreme.mod.DevExpress.viz.dxChartCommonSeriesSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBarGroupPadding extends js.Object {
  var barGroupPadding: js.UndefOr[Double] = js.native
  var barGroupWidth: js.UndefOr[Double] = js.native
  var barWidth: js.UndefOr[Double] = js.native
  var bottomIndent: js.UndefOr[Double] = js.native
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.native
  var dataPrepareSettings: js.UndefOr[AnonConvertToAxisDataType] = js.native
  var equalBarWidth: js.UndefOr[Boolean] = js.native
  var maxBubbleSize: js.UndefOr[Double] = js.native
  var minBubbleSize: js.UndefOr[Double] = js.native
  var negativesAsZeroes: js.UndefOr[Boolean] = js.native
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  var series: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.native
  var seriesTemplate: js.UndefOr[AnonCustomizeSeries] = js.native
  var topIndent: js.UndefOr[Double] = js.native
  var useAggregation: js.UndefOr[Boolean] = js.native
  var valueAxis: js.UndefOr[AnonInverted] = js.native
}

object AnonBarGroupPadding {
  @scala.inline
  def apply(): AnonBarGroupPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBarGroupPadding]
  }
  @scala.inline
  implicit class AnonBarGroupPaddingOps[Self <: AnonBarGroupPadding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarGroupPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGroupPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withBarGroupWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGroupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonSeriesSettings(value: dxChartCommonSeriesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonSeriesSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDataPrepareSettings(value: AnonConvertToAxisDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPrepareSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPrepareSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPrepareSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualBarWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalBarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalBarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBubbleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBubbleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBubbleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBubbleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBubbleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBubbleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBubbleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBubbleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativesAsZeroes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativesAsZeroes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativesAsZeroes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativesAsZeroes")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteExtensionMode(value: alternate | blend | extrapolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteExtensionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: ChartSeries | js.Array[ChartSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesTemplate(value: AnonCustomizeSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTopIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAggregation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAggregation")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAxis(value: AnonInverted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(js.undefined)
        ret
    }
  }
  
}

