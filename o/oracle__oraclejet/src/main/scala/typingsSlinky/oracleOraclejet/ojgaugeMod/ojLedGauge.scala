package typingsSlinky.oracleOraclejet.ojgaugeMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.Text
import typingsSlinky.oracleOraclejet.anon.TextType
import typingsSlinky.oracleOraclejet.anon.`10`
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`0`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`180`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`270`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`90`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.label
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.metricLabel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.metricLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rotation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rotationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.size
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLedGauge extends dvtBaseGauge[ojLedGaugeSettableProperties] {
  
  def addEventListener(`type`: rotationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: rotationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: svgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: typeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: visualEffectsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(`type`: borderColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(`type`: colorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(`type`: labelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(`type`: maxChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(`type`: metricLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: metricLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(`type`: minChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeChanged(`type`: sizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeChanged(
    `type`: sizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(`type`: svgClassNameChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(`type`: thresholdsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var borderColor: String = js.native
  
  var color: String = js.native
  
  def getMetricLabel(): String = js.native
  
  @JSName("getProperty")
  def getProperty_borderColor(property: borderColor): String = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): Text = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_metricLabel(property: metricLabel): TextType = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_rotation(property: rotation): `90` | `180` | `270` | `0` = js.native
  @JSName("getProperty")
  def getProperty_size(property: size): Double = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `10` = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): arrow | diamond | square | rectangle | triangle | star | human | circle = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  
  var label: Text = js.native
  
  var max: Double = js.native
  
  var metricLabel: TextType = js.native
  
  var min: Double = js.native
  
  var onBorderColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMetricLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRotationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onThresholdsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onVisualEffectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var rotation: `90` | `180` | `270` | `0` = js.native
  
  def setProperties(properties: ojLedGaugeSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: `type`, value: arrow): Unit = js.native
  def setProperty(property: `type`, value: circle): Unit = js.native
  def setProperty(property: `type`, value: diamond): Unit = js.native
  def setProperty(property: `type`, value: human): Unit = js.native
  def setProperty(property: `type`, value: rectangle): Unit = js.native
  def setProperty(property: `type`, value: square): Unit = js.native
  def setProperty(property: `type`, value: star): Unit = js.native
  def setProperty(property: `type`, value: triangle): Unit = js.native
  def setProperty(property: rotation, value: `0`): Unit = js.native
  def setProperty(property: rotation, value: `180`): Unit = js.native
  def setProperty(property: rotation, value: `270`): Unit = js.native
  def setProperty(property: rotation, value: `90`): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: Text): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_metricLabel(property: metricLabel, value: TextType): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_size(property: size, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `10`): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  
  var size: Double = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `10` = js.native
  
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojLedGauge {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait Threshold extends StObject {
    
    var borderColor: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var shortDesc: js.UndefOr[String] = js.native
  }
  object Threshold {
    
    @scala.inline
    def apply(): Threshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Threshold]
    }
    
    @scala.inline
    implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait TooltipContext extends StObject {
    
    var color: String = js.native
    
    var componentElement: Element = js.native
    
    var label: String = js.native
    
    var parentElement: Element = js.native
  }
  object TooltipContext {
    
    @scala.inline
    def apply(color: String, componentElement: Element, label: String, parentElement: Element): TooltipContext = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext]
    }
    
    @scala.inline
    implicit class TooltipContextMutableBuilder[Self <: TooltipContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
}
