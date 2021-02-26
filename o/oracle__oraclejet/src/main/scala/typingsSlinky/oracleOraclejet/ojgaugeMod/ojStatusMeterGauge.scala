package typingsSlinky.oracleOraclejet.ojgaugeMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.BorderColorBorderRadius
import typingsSlinky.oracleOraclejet.anon.ConverterPosition
import typingsSlinky.oracleOraclejet.anon.PositionStyle
import typingsSlinky.oracleOraclejet.anon.`12`
import typingsSlinky.oracleOraclejet.anon.`13`
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.ReferenceLine
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.angleExtent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.angleExtentChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderRadius
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderRadiusChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centerChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circular
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorSize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorSizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerRadius
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerRadiusChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.label
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.metricLabel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.metricLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.onIndicator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plotArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plotAreaChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readonly_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.referenceLines
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.referenceLinesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startAngle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startAngleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.step
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholdDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholdDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojStatusMeterGauge extends dvtBaseGauge[ojStatusMeterGaugeSettableProperties] {
  
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: svgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: thresholdDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: thresholdDisplayChanged,
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
  def addEventListener_angleExtentChanged(`type`: angleExtentChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_angleExtentChanged(
    `type`: angleExtentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
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
  def addEventListener_borderRadiusChanged(`type`: borderRadiusChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderRadiusChanged(
    `type`: borderRadiusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_centerChanged(`type`: centerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_centerChanged(
    `type`: centerChanged,
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
  def addEventListener_indicatorSizeChanged(`type`: indicatorSizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_indicatorSizeChanged(
    `type`: indicatorSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_innerRadiusChanged(`type`: innerRadiusChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_innerRadiusChanged(
    `type`: innerRadiusChanged,
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
  def addEventListener_plotAreaChanged(`type`: plotAreaChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(`type`: readonlyChanged_, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceLinesChanged(`type`: referenceLinesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceLinesChanged(
    `type`: referenceLinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(`type`: startAngleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(
    `type`: startAngleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(`type`: stepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: stepChanged,
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
  def addEventListener_transientValueChanged(`type`: transientValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
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
  
  var angleExtent: Double = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var borderColor: String = js.native
  
  var borderRadius: String = js.native
  
  var center: `12` = js.native
  
  var color: String = js.native
  
  def getMetricLabel(): String = js.native
  
  @JSName("getProperty")
  def getProperty_angleExtent(property: angleExtent): Double = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: borderColor): String = js.native
  @JSName("getProperty")
  def getProperty_borderRadius(property: borderRadius): String = js.native
  @JSName("getProperty")
  def getProperty_center(property: center): `12` = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_indicatorSize(property: indicatorSize): Double = js.native
  @JSName("getProperty")
  def getProperty_innerRadius(property: innerRadius): Double = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): PositionStyle = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_metricLabel(property: metricLabel): ConverterPosition = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): circular | vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): BorderColorBorderRadius = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_referenceLines(property: referenceLines): js.Array[ReferenceLine] = js.native
  @JSName("getProperty")
  def getProperty_startAngle(property: startAngle): Double = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_thresholdDisplay(property: thresholdDisplay): currentOnly | all | onIndicator = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `13` = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  
  var indicatorSize: Double = js.native
  
  var innerRadius: Double = js.native
  
  var label: PositionStyle = js.native
  
  var max: Double = js.native
  
  var metricLabel: ConverterPosition = js.native
  
  var min: Double = js.native
  
  var onAngleExtentChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationDurationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onBorderColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onBorderRadiusChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onCenterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onIndicatorSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onInnerRadiusChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMetricLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPlotAreaChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onReadonlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onReferenceLinesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStartAngleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onThresholdDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onThresholdsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTransientValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onVisualEffectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var orientation: circular | vertical | horizontal = js.native
  
  var plotArea: BorderColorBorderRadius = js.native
  
  var readonly: Boolean = js.native
  
  var referenceLines: js.Array[ReferenceLine] = js.native
  
  def setProperties(properties: ojStatusMeterGaugeSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: orientation, value: circular): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: thresholdDisplay, value: all): Unit = js.native
  def setProperty(property: thresholdDisplay, value: currentOnly): Unit = js.native
  def setProperty(property: thresholdDisplay, value: onIndicator): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_angleExtent(property: angleExtent, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderRadius(property: borderRadius, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_center(property: center, value: `12`): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_indicatorSize(property: indicatorSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_innerRadius(property: innerRadius, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: PositionStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_metricLabel(property: metricLabel, value: ConverterPosition): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: BorderColorBorderRadius): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceLines(property: referenceLines, value: js.Array[ReferenceLine]): Unit = js.native
  @JSName("setProperty")
  def setProperty_startAngle(property: startAngle, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `13`): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  
  var startAngle: Double = js.native
  
  var step: Double | Null = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var thresholdDisplay: currentOnly | all | onIndicator = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `13` = js.native
  
  val transientValue: Double | Null = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojStatusMeterGauge {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait Bounds extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Bounds {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Bounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait CenterContext extends StObject {
    
    var componentElement: Element = js.native
    
    var innerBounds: Bounds = js.native
    
    var metricLabel: String = js.native
    
    var outerBounds: Bounds = js.native
  }
  object CenterContext {
    
    @scala.inline
    def apply(componentElement: Element, innerBounds: Bounds, metricLabel: String, outerBounds: Bounds): CenterContext = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CenterContext]
    }
    
    @scala.inline
    implicit class CenterContextMutableBuilder[Self <: CenterContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBounds(value: Bounds): Self = StObject.set(x, "innerBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricLabel(value: String): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBounds(value: Bounds): Self = StObject.set(x, "outerBounds", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ReferenceLine extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object ReferenceLine {
    
    @scala.inline
    def apply(): ReferenceLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferenceLine]
    }
    
    @scala.inline
    implicit class ReferenceLineMutableBuilder[Self <: ReferenceLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
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
