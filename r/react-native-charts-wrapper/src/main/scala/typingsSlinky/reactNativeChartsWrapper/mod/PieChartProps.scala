package typingsSlinky.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartProps extends PieRadarChartBase {
  
  var centerText: js.UndefOr[String] = js.native
  
  var centerTextRadiusPercent: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[PieData] = js.native
  
  var drawEntryLabels: js.UndefOr[Boolean] = js.native
  
  var entryLabelColor: js.UndefOr[Color] = js.native
  
  var entryLabelTextSize: js.UndefOr[Double] = js.native
  
  var holeColor: js.UndefOr[Color] = js.native
  
  var holeRadius: js.UndefOr[Double] = js.native
  
  var maxAngle: js.UndefOr[Double] = js.native
  
  var styledCenterText: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.anon.Color] = js.native
  
  var transparentCircleColor: js.UndefOr[Color] = js.native
  
  var transparentCircleRadius: js.UndefOr[Double] = js.native
  
  var usePercentValues: js.UndefOr[Boolean] = js.native
}
object PieChartProps {
  
  @scala.inline
  def apply(): PieChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartProps]
  }
  
  @scala.inline
  implicit class PieChartPropsMutableBuilder[Self <: PieChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterText(value: String): Self = StObject.set(x, "centerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterTextRadiusPercent(value: Double): Self = StObject.set(x, "centerTextRadiusPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterTextRadiusPercentUndefined: Self = StObject.set(x, "centerTextRadiusPercent", js.undefined)
    
    @scala.inline
    def setCenterTextUndefined: Self = StObject.set(x, "centerText", js.undefined)
    
    @scala.inline
    def setData(value: PieData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDrawEntryLabels(value: Boolean): Self = StObject.set(x, "drawEntryLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawEntryLabelsUndefined: Self = StObject.set(x, "drawEntryLabels", js.undefined)
    
    @scala.inline
    def setEntryLabelColor(value: Color): Self = StObject.set(x, "entryLabelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryLabelColorUndefined: Self = StObject.set(x, "entryLabelColor", js.undefined)
    
    @scala.inline
    def setEntryLabelTextSize(value: Double): Self = StObject.set(x, "entryLabelTextSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryLabelTextSizeUndefined: Self = StObject.set(x, "entryLabelTextSize", js.undefined)
    
    @scala.inline
    def setHoleColor(value: Color): Self = StObject.set(x, "holeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoleColorUndefined: Self = StObject.set(x, "holeColor", js.undefined)
    
    @scala.inline
    def setHoleRadius(value: Double): Self = StObject.set(x, "holeRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoleRadiusUndefined: Self = StObject.set(x, "holeRadius", js.undefined)
    
    @scala.inline
    def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
    
    @scala.inline
    def setStyledCenterText(value: typingsSlinky.reactNativeChartsWrapper.anon.Color): Self = StObject.set(x, "styledCenterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyledCenterTextUndefined: Self = StObject.set(x, "styledCenterText", js.undefined)
    
    @scala.inline
    def setTransparentCircleColor(value: Color): Self = StObject.set(x, "transparentCircleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentCircleColorUndefined: Self = StObject.set(x, "transparentCircleColor", js.undefined)
    
    @scala.inline
    def setTransparentCircleRadius(value: Double): Self = StObject.set(x, "transparentCircleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentCircleRadiusUndefined: Self = StObject.set(x, "transparentCircleRadius", js.undefined)
    
    @scala.inline
    def setUsePercentValues(value: Boolean): Self = StObject.set(x, "usePercentValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePercentValuesUndefined: Self = StObject.set(x, "usePercentValues", js.undefined)
  }
}
