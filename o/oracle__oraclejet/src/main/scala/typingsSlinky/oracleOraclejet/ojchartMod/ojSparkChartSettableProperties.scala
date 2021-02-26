package typingsSlinky.oracleOraclejet.ojchartMod

import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.`0`
import typingsSlinky.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.area
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.curved
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.line
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.straight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSparkChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  
  var animationDuration: Double | Null = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var areaColor: String = js.native
  
  var areaSvgClassName: String = js.native
  
  var areaSvgStyle: js.Object = js.native
  
  var as: String = js.native
  
  var barGapRatio: Double = js.native
  
  var baselineScaling: zero | min = js.native
  
  var color: String = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var firstColor: String = js.native
  
  var highColor: String = js.native
  
  var lastColor: String = js.native
  
  var lineStyle: dotted | dashed | solid = js.native
  
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  
  var lineWidth: Double = js.native
  
  var lowColor: String = js.native
  
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  
  var markerSize: Double = js.native
  
  var referenceObjects: js.Array[ReferenceObject] = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var tooltip: `0` = js.native
  
  @JSName("translations")
  var translations_ojSparkChartSettableProperties: LabelAndValue = js.native
  
  var `type`: area | lineWithArea | bar | line = js.native
  
  var visualEffects: none | auto = js.native
}
object ojSparkChartSettableProperties {
  
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    areaColor: String,
    areaSvgClassName: String,
    areaSvgStyle: js.Object,
    as: String,
    barGapRatio: Double,
    baselineScaling: zero | min,
    color: String,
    firstColor: String,
    highColor: String,
    lastColor: String,
    lineStyle: dotted | dashed | solid,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight,
    lineWidth: Double,
    lowColor: String,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String,
    markerSize: Double,
    referenceObjects: js.Array[ReferenceObject],
    svgClassName: String,
    svgStyle: js.Object,
    tooltip: `0`,
    trackResize: on | off,
    translations: LabelAndValue,
    `type`: area | lineWithArea | bar | line,
    visualEffects: none | auto
  ): ojSparkChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], areaColor = areaColor.asInstanceOf[js.Any], areaSvgClassName = areaSvgClassName.asInstanceOf[js.Any], areaSvgStyle = areaSvgStyle.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], firstColor = firstColor.asInstanceOf[js.Any], highColor = highColor.asInstanceOf[js.Any], lastColor = lastColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], lowColor = lowColor.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartSettableProperties[K, D]]
  }
  
  @scala.inline
  implicit class ojSparkChartSettablePropertiesMutableBuilder[Self <: ojSparkChartSettableProperties[_, _], K, D] (val x: Self with (ojSparkChartSettableProperties[K, D])) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationNull: Self = StObject.set(x, "animationDuration", null)
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaColor(value: String): Self = StObject.set(x, "areaColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaSvgClassName(value: String): Self = StObject.set(x, "areaSvgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaSvgStyle(value: js.Object): Self = StObject.set(x, "areaSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarGapRatio(value: Double): Self = StObject.set(x, "barGapRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineScaling(value: zero | min): Self = StObject.set(x, "baselineScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setFirstColor(value: String): Self = StObject.set(x, "firstColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighColor(value: String): Self = StObject.set(x, "highColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColor(value: String): Self = StObject.set(x, "lastColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineType(value: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowColor(value: String): Self = StObject.set(x, "lowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerShape(value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjects(value: js.Array[ReferenceObject]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjectsVarargs(value: ReferenceObject*): Self = StObject.set(x, "referenceObjects", js.Array(value :_*))
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: `0`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: area | lineWithArea | bar | line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
  }
}
