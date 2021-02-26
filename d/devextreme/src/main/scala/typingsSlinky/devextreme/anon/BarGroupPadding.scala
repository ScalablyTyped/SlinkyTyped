package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarGroupPadding extends StObject {
  
  var barGroupPadding: js.UndefOr[Double] = js.native
  
  var barGroupWidth: js.UndefOr[Double] = js.native
  
  var bottomIndent: js.UndefOr[Double] = js.native
  
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.native
  
  var dataPrepareSettings: js.UndefOr[ConvertToAxisDataType] = js.native
  
  var maxBubbleSize: js.UndefOr[Double] = js.native
  
  var minBubbleSize: js.UndefOr[Double] = js.native
  
  var negativesAsZeroes: js.UndefOr[Boolean] = js.native
  
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  
  var series: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.native
  
  var seriesTemplate: js.UndefOr[CustomizeSeries] = js.native
  
  var topIndent: js.UndefOr[Double] = js.native
  
  var valueAxis: js.UndefOr[Inverted] = js.native
}
object BarGroupPadding {
  
  @scala.inline
  def apply(): BarGroupPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGroupPadding]
  }
  
  @scala.inline
  implicit class BarGroupPaddingMutableBuilder[Self <: BarGroupPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarGroupPadding(value: Double): Self = StObject.set(x, "barGroupPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarGroupPaddingUndefined: Self = StObject.set(x, "barGroupPadding", js.undefined)
    
    @scala.inline
    def setBarGroupWidth(value: Double): Self = StObject.set(x, "barGroupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarGroupWidthUndefined: Self = StObject.set(x, "barGroupWidth", js.undefined)
    
    @scala.inline
    def setBottomIndent(value: Double): Self = StObject.set(x, "bottomIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomIndentUndefined: Self = StObject.set(x, "bottomIndent", js.undefined)
    
    @scala.inline
    def setCommonSeriesSettings(value: dxChartCommonSeriesSettings): Self = StObject.set(x, "commonSeriesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonSeriesSettingsUndefined: Self = StObject.set(x, "commonSeriesSettings", js.undefined)
    
    @scala.inline
    def setDataPrepareSettings(value: ConvertToAxisDataType): Self = StObject.set(x, "dataPrepareSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPrepareSettingsUndefined: Self = StObject.set(x, "dataPrepareSettings", js.undefined)
    
    @scala.inline
    def setMaxBubbleSize(value: Double): Self = StObject.set(x, "maxBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBubbleSizeUndefined: Self = StObject.set(x, "maxBubbleSize", js.undefined)
    
    @scala.inline
    def setMinBubbleSize(value: Double): Self = StObject.set(x, "minBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBubbleSizeUndefined: Self = StObject.set(x, "minBubbleSize", js.undefined)
    
    @scala.inline
    def setNegativesAsZeroes(value: Boolean): Self = StObject.set(x, "negativesAsZeroes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativesAsZeroesUndefined: Self = StObject.set(x, "negativesAsZeroes", js.undefined)
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: ChartSeries | js.Array[ChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTemplate(value: CustomizeSeries): Self = StObject.set(x, "seriesTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTemplateUndefined: Self = StObject.set(x, "seriesTemplate", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: ChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setTopIndent(value: Double): Self = StObject.set(x, "topIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopIndentUndefined: Self = StObject.set(x, "topIndent", js.undefined)
    
    @scala.inline
    def setValueAxis(value: Inverted): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
