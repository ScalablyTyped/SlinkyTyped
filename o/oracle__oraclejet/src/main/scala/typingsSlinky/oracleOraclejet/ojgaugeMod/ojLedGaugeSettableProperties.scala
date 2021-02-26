package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.Text
import typingsSlinky.oracleOraclejet.anon.TextType
import typingsSlinky.oracleOraclejet.anon.`10`
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`0`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`180`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`270`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`90`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLedGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  
  var borderColor: String = js.native
  
  var color: String = js.native
  
  var label: Text = js.native
  
  var max: Double = js.native
  
  var metricLabel: TextType = js.native
  
  var min: Double = js.native
  
  var rotation: `90` | `180` | `270` | `0` = js.native
  
  var size: Double = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `10` = js.native
  
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojLedGaugeSettableProperties {
  
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    label: Text,
    max: Double,
    metricLabel: TextType,
    min: Double,
    rotation: `90` | `180` | `270` | `0`,
    size: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholds: js.Array[Threshold],
    tooltip: `10`,
    trackResize: on | off,
    translations: LabelAndValue,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle,
    visualEffects: none | auto
  ): ojLedGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettableProperties]
  }
  
  @scala.inline
  implicit class ojLedGaugeSettablePropertiesMutableBuilder[Self <: ojLedGaugeSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Text): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricLabel(value: TextType): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: `90` | `180` | `270` | `0`): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    
    @scala.inline
    def setTooltip(value: `10`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: arrow | diamond | square | rectangle | triangle | star | human | circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
  }
}
