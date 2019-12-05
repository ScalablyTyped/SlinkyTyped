package typingsSlinky.atOracleOraclejet.ojchartMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.Anon_ContextRenderer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.`type`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationDuration
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationDurationChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.area
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaColorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaSvgClassName
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaSvgClassNameChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaSvgStyle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaSvgStyleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.as
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bar
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.barGapRatio
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.barGapRatioChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.baselineScaling
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.baselineScalingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.centeredSegmented
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.centeredStepped
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.color
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.colorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.curved
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.data
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.firstColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.firstColorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highColorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.human
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lastColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lastColorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.line
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineStyle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineStyleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineType
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineTypeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineWidth
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineWidthChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineWithArea
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lowColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lowColorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerShape
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerShapeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerSize
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerSizeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.min
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.referenceObjects
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.referenceObjectsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.segmented
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.solid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.square
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.star
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stepped
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.straight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgClassName
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgClassNameChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgStyle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgStyleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltip
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltipChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.typeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.visualEffects
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.visualEffectsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zero
import typingsSlinky.atOracleOraclejet.ojchartMod.ojSparkChart.ItemContext
import typingsSlinky.atOracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojSparkChart")
@js.native
trait ojSparkChart_[K, D] extends dvtBaseComponent[ojSparkChartSettableProperties[K, D]] {
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
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var tooltip: Anon_ContextRenderer = js.native
  @JSName("translations")
  var translations_ojSparkChart_ : Anon_ComponentNameLabelAndValue = js.native
  var `type`: area | lineWithArea | bar | line = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zero | min], _]
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zero | min], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dotted | dashed | solid], _]
  ): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dotted | dashed | solid], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[area | lineWithArea | bar | line], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[area | lineWithArea | bar | line], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
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
  def getProperty_tooltip(property: tooltip): Anon_ContextRenderer = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): area | lineWithArea | bar | line = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
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
  def setProperty(
    property: markerShape,
    value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ): Unit = js.native
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
  def setProperty_markerSize(property: markerSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon_ContextRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameLabelAndValue): Unit = js.native
}

