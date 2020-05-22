package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.aboveMarker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.afterMarker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.beforeMarker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.belowMarker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.curved
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.explode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gradient
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightAndExplode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.insideBarEdge
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outsideBarEdge
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outsideSlice
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pattern
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.straight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationDownColor extends js.Object {
  var animationDownColor: String
  var animationDuration: Double
  var animationIndicators: none | all
  var animationUpColor: String
  var barGapRatio: Double
  var borderColor: String
  var borderWidth: Double
  var boxPlot: MedianSvgClassName
  var colors: js.Array[String]
  var dataCursor: LineColor
  var dataItemGaps: String
  var dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  var dataLabelStyle: js.Object | js.Array[js.Object]
  var funnelBackgroundColor: String
  var groupSeparators: Rendered
  var hoverBehaviorDelay: Double
  var lineStyle: dotted | dashed | solid
  var lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
  var lineWidth: Double
  var markerColor: String
  var markerDisplayed: on | off | auto
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSize: Double
  var marqueeBorderColor: String
  var marqueeColor: String
  var maxBarWidth: Double
  var otherColor: String
  var patterns: js.Array[String]
  var pieFeelerColor: String
  var pieInnerRadius: Double
  var selectionEffect: explode | highlightAndExplode | highlight
  var seriesEffect: color | pattern | gradient
  var shapes: js.Array[String]
  var stackLabelStyle: js.Object
  var stockFallingColor: String
  var stockRangeColor: String
  var stockRisingColor: String
  var stockVolumeColor: String
  var threeDEffect: on | off
  var tooltipLabelStyle: js.Object
  var tooltipValueStyle: js.Object
}

object AnimationDownColor {
  @scala.inline
  def apply(
    animationDownColor: String,
    animationDuration: Double,
    animationIndicators: none | all,
    animationUpColor: String,
    barGapRatio: Double,
    borderColor: String,
    borderWidth: Double,
    boxPlot: MedianSvgClassName,
    colors: js.Array[String],
    dataCursor: LineColor,
    dataItemGaps: String,
    dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto,
    dataLabelStyle: js.Object | js.Array[js.Object],
    funnelBackgroundColor: String,
    groupSeparators: Rendered,
    hoverBehaviorDelay: Double,
    lineStyle: dotted | dashed | solid,
    lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto,
    lineWidth: Double,
    markerColor: String,
    markerDisplayed: on | off | auto,
    markerSize: Double,
    marqueeBorderColor: String,
    marqueeColor: String,
    maxBarWidth: Double,
    otherColor: String,
    patterns: js.Array[String],
    pieFeelerColor: String,
    pieInnerRadius: Double,
    selectionEffect: explode | highlightAndExplode | highlight,
    seriesEffect: color | pattern | gradient,
    shapes: js.Array[String],
    stackLabelStyle: js.Object,
    stockFallingColor: String,
    stockRangeColor: String,
    stockRisingColor: String,
    stockVolumeColor: String,
    threeDEffect: on | off,
    tooltipLabelStyle: js.Object,
    tooltipValueStyle: js.Object,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = null
  ): AnimationDownColor = {
    val __obj = js.Dynamic.literal(animationDownColor = animationDownColor.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], animationIndicators = animationIndicators.asInstanceOf[js.Any], animationUpColor = animationUpColor.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], boxPlot = boxPlot.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataItemGaps = dataItemGaps.asInstanceOf[js.Any], dataLabelPosition = dataLabelPosition.asInstanceOf[js.Any], dataLabelStyle = dataLabelStyle.asInstanceOf[js.Any], funnelBackgroundColor = funnelBackgroundColor.asInstanceOf[js.Any], groupSeparators = groupSeparators.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], marqueeBorderColor = marqueeBorderColor.asInstanceOf[js.Any], marqueeColor = marqueeColor.asInstanceOf[js.Any], maxBarWidth = maxBarWidth.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pieFeelerColor = pieFeelerColor.asInstanceOf[js.Any], pieInnerRadius = pieInnerRadius.asInstanceOf[js.Any], selectionEffect = selectionEffect.asInstanceOf[js.Any], seriesEffect = seriesEffect.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], stackLabelStyle = stackLabelStyle.asInstanceOf[js.Any], stockFallingColor = stockFallingColor.asInstanceOf[js.Any], stockRangeColor = stockRangeColor.asInstanceOf[js.Any], stockRisingColor = stockRisingColor.asInstanceOf[js.Any], stockVolumeColor = stockVolumeColor.asInstanceOf[js.Any], threeDEffect = threeDEffect.asInstanceOf[js.Any], tooltipLabelStyle = tooltipLabelStyle.asInstanceOf[js.Any], tooltipValueStyle = tooltipValueStyle.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDownColor]
  }
}

