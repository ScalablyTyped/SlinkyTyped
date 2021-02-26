package typingsSlinky.oracleOraclejet.ojchartMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.`0`
import typingsSlinky.oracleOraclejet.ojchartMod.ojSparkChart.ItemContext
import typingsSlinky.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.area
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.back
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.barGapRatio
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.barGapRatioChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.baselineScaling
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.baselineScalingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.curved
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.front
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lastColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lastColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.line
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineTypeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWidth
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWidthChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lowColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lowColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerShape
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerShapeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.referenceObjects
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.referenceObjectsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.straight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSparkChart[K, D] extends dvtBaseComponent[ojSparkChartSettableProperties[K, D]] {
  
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
  def addEventListener(`type`: areaSvgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: baselineScalingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: lineStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: lineTypeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: markerShapeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
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
  def addEventListener_areaColorChanged(`type`: areaColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(`type`: barGapRatioChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
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
  def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(`type`: firstColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(`type`: highColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(`type`: lastColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(`type`: lineWidthChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(`type`: lowColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(`type`: markerSizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
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
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
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
  
  def getDataItem(itemIndex: Double): ItemContext | Null = js.native
  
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_areaColor(property: areaColor): String = js.native
  @JSName("getProperty")
  def getProperty_areaSvgClassName(property: areaSvgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_areaSvgStyle(property: areaSvgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_barGapRatio(property: barGapRatio): Double = js.native
  @JSName("getProperty")
  def getProperty_baselineScaling(property: baselineScaling): zero | min = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_firstColor(property: firstColor): String = js.native
  @JSName("getProperty")
  def getProperty_highColor(property: highColor): String = js.native
  @JSName("getProperty")
  def getProperty_lastColor(property: lastColor): String = js.native
  @JSName("getProperty")
  def getProperty_lineStyle(property: lineStyle): dotted | dashed | solid = js.native
  @JSName("getProperty")
  def getProperty_lineType(property: lineType): curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  @JSName("getProperty")
  def getProperty_lineWidth(property: lineWidth): Double = js.native
  @JSName("getProperty")
  def getProperty_lowColor(property: lowColor): String = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: markerShape): auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  @JSName("getProperty")
  def getProperty_markerSize(property: markerSize): Double = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: referenceObjects): js.Array[ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `0` = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): area | lineWithArea | bar | line = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  
  var highColor: String = js.native
  
  var lastColor: String = js.native
  
  var lineStyle: dotted | dashed | solid = js.native
  
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  
  var lineWidth: Double = js.native
  
  var lowColor: String = js.native
  
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  
  var markerSize: Double = js.native
  
  var onAnimationDurationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAreaColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAreaSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAreaSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onBarGapRatioChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onBaselineScalingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onFirstColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLastColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLineStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLineTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLineWidthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLowColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerShapeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onReferenceObjectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onVisualEffectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var referenceObjects: js.Array[ReferenceObject] = js.native
  
  def setProperties(properties: ojSparkChartSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: `type`, value: area): Unit = js.native
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: line): Unit = js.native
  def setProperty(property: `type`, value: lineWithArea): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: baselineScaling, value: min): Unit = js.native
  def setProperty(property: baselineScaling, value: zero): Unit = js.native
  def setProperty(property: lineStyle, value: dashed): Unit = js.native
  def setProperty(property: lineStyle, value: dotted): Unit = js.native
  def setProperty(property: lineStyle, value: solid): Unit = js.native
  def setProperty(property: lineType, value: centeredSegmented): Unit = js.native
  def setProperty(property: lineType, value: centeredStepped): Unit = js.native
  def setProperty(property: lineType, value: curved): Unit = js.native
  def setProperty(property: lineType, value: none): Unit = js.native
  def setProperty(property: lineType, value: segmented): Unit = js.native
  def setProperty(property: lineType, value: stepped): Unit = js.native
  def setProperty(property: lineType, value: straight): Unit = js.native
  def setProperty(property: markerShape, value: auto): Unit = js.native
  def setProperty(property: markerShape, value: circle): Unit = js.native
  def setProperty(property: markerShape, value: diamond): Unit = js.native
  def setProperty(property: markerShape, value: human): Unit = js.native
  def setProperty(property: markerShape, value: plus): Unit = js.native
  def setProperty(property: markerShape, value: square): Unit = js.native
  def setProperty(property: markerShape, value: star): Unit = js.native
  def setProperty(property: markerShape, value: triangleDown): Unit = js.native
  def setProperty(property: markerShape, value: triangleUp): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaColor(property: areaColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgClassName(property: areaSvgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgStyle(property: areaSvgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_barGapRatio(property: barGapRatio, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstColor(property: firstColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_highColor(property: highColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_lastColor(property: lastColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_lineWidth(property: lineWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_lowColor(property: lowColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerShape(property: markerShape, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: markerSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `0`): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var tooltip: `0` = js.native
  
  @JSName("translations")
  var translations_ojSparkChart: LabelAndValue = js.native
  
  var `type`: area | lineWithArea | bar | line = js.native
  
  var visualEffects: none | auto = js.native
}
object ojSparkChart {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait Item extends StObject {
    
    var borderColor: String = js.native
    
    var color: String = js.native
    
    var date: js.Date = js.native
    
    var high: Double = js.native
    
    var low: Double = js.native
    
    var markerDisplayed: on | off = js.native
    
    var markerShape: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String = js.native
    
    var markerSize: Double = js.native
    
    var svgClassName: String = js.native
    
    var svgStyle: js.Object = js.native
    
    var value: Double = js.native
  }
  object Item {
    
    @scala.inline
    def apply(
      borderColor: String,
      color: String,
      date: js.Date,
      high: Double,
      low: Double,
      markerDisplayed: on | off,
      markerShape: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String,
      markerSize: Double,
      svgClassName: String,
      svgStyle: js.Object,
      value: Double
    ): Item = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerDisplayed(value: on | off): Self = StObject.set(x, "markerDisplayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerShape(value: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ItemContext extends StObject {
    
    var borderColor: String = js.native
    
    var color: String = js.native
    
    var date: js.Date = js.native
    
    var high: Double = js.native
    
    var low: Double = js.native
    
    var value: Double = js.native
  }
  object ItemContext {
    
    @scala.inline
    def apply(borderColor: String, color: String, date: js.Date, high: Double, low: Double, value: Double): ItemContext = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContext]
    }
    
    @scala.inline
    implicit class ItemContextMutableBuilder[Self <: ItemContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ReferenceObject extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var high: js.UndefOr[Double] = js.native
    
    var lineStyle: dotted | dashed | solid = js.native
    
    var lineWidth: js.UndefOr[Double] = js.native
    
    var location: front | back = js.native
    
    var low: js.UndefOr[Double] = js.native
    
    var svgClassName: js.UndefOr[String] = js.native
    
    var svgStyle: js.UndefOr[js.Object] = js.native
    
    var `type`: area | line = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object ReferenceObject {
    
    @scala.inline
    def apply(lineStyle: dotted | dashed | solid, location: front | back, `type`: area | line): ReferenceObject = {
      val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceObject]
    }
    
    @scala.inline
    implicit class ReferenceObjectMutableBuilder[Self <: ReferenceObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setLineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setLocation(value: front | back): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      @scala.inline
      def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      @scala.inline
      def setType(value: area | line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait TooltipContext extends StObject {
    
    var color: String = js.native
    
    var componentElement: Element = js.native
    
    var parentElement: Element = js.native
  }
  object TooltipContext {
    
    @scala.inline
    def apply(color: String, componentElement: Element, parentElement: Element): TooltipContext = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext]
    }
    
    @scala.inline
    implicit class TooltipContextMutableBuilder[Self <: TooltipContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
}
