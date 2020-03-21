package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.DataKey
import typingsSlinky.recharts.mod.Percentage
import typingsSlinky.recharts.mod.PolarAngleAxisProps
import typingsSlinky.recharts.mod.PolarAngleAxisTick
import typingsSlinky.recharts.mod.RechartsFunction
import typingsSlinky.recharts.mod.ScaleType
import typingsSlinky.recharts.rechartsNumbers.`100`
import typingsSlinky.recharts.rechartsNumbers.`200`
import typingsSlinky.recharts.rechartsNumbers.`300`
import typingsSlinky.recharts.rechartsNumbers.`400`
import typingsSlinky.recharts.rechartsNumbers.`500`
import typingsSlinky.recharts.rechartsNumbers.`600`
import typingsSlinky.recharts.rechartsNumbers.`700`
import typingsSlinky.recharts.rechartsNumbers.`800`
import typingsSlinky.recharts.rechartsNumbers.`900`
import typingsSlinky.recharts.rechartsStrings.auto
import typingsSlinky.recharts.rechartsStrings.bold
import typingsSlinky.recharts.rechartsStrings.bolder
import typingsSlinky.recharts.rechartsStrings.category
import typingsSlinky.recharts.rechartsStrings.circle
import typingsSlinky.recharts.rechartsStrings.crispEdges
import typingsSlinky.recharts.rechartsStrings.geometricPrecision
import typingsSlinky.recharts.rechartsStrings.inherit
import typingsSlinky.recharts.rechartsStrings.inner
import typingsSlinky.recharts.rechartsStrings.lighter
import typingsSlinky.recharts.rechartsStrings.normal
import typingsSlinky.recharts.rechartsStrings.number
import typingsSlinky.recharts.rechartsStrings.optimizeLegibility
import typingsSlinky.recharts.rechartsStrings.optimizeQuality
import typingsSlinky.recharts.rechartsStrings.optimizeSpeed
import typingsSlinky.recharts.rechartsStrings.outer
import typingsSlinky.recharts.rechartsStrings.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PolarAngleAxis
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.mod.PolarAngleAxis] {
  @JSImport("recharts", "PolarAngleAxis")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alignmentBaseline: String = null,
    angle: Int | Double = null,
    angleAxisId: String | Double = null,
    axisLine: Boolean | js.Object = null,
    axisLineType: polygon | circle = null,
    baselineShift: String = null,
    clip: String = null,
    clipPath: String = null,
    clipRule: String = null,
    color: String = null,
    colorInterpolation: String = null,
    colorInterpolationFilters: String = null,
    colorProfile: String = null,
    colorRendering: String = null,
    cursor: String = null,
    cx: Int | Double = null,
    cy: Int | Double = null,
    dataKey: DataKey = null,
    direction: String = null,
    display: String = null,
    dominantBaseline: String = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    enableBackground: String = null,
    fill: String = null,
    fillOpacity: Double | String = null,
    fillRule: String = null,
    filter: String = null,
    floodColor: String = null,
    floodOpacity: String = null,
    font: String = null,
    fontFamily: String = null,
    fontSize: Double | String = null,
    fontSizeAdjust: Double | String = null,
    fontStretch: String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit = null,
    glyphOrientationHorizontal: String = null,
    glyphOrientationVertical: String = null,
    height: Int | Double = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    imageRendering: auto | optimizeSpeed | optimizeQuality | inherit = null,
    kerning: Double | String = null,
    letterSpacing: String = null,
    lightingColor: String = null,
    markerEnd: String = null,
    markerMid: String = null,
    markerStart: String = null,
    mask: String = null,
    onClick: /* repeated */ js.Any => Unit = null,
    onMouseDown: /* repeated */ js.Any => Unit = null,
    onMouseEnter: /* repeated */ js.Any => Unit = null,
    onMouseLeave: /* repeated */ js.Any => Unit = null,
    onMouseMove: /* repeated */ js.Any => Unit = null,
    onMouseOut: /* repeated */ js.Any => Unit = null,
    onMouseOver: /* repeated */ js.Any => Unit = null,
    onMouseUp: /* repeated */ js.Any => Unit = null,
    onTouchCancel: /* repeated */ js.Any => Unit = null,
    onTouchEnd: /* repeated */ js.Any => Unit = null,
    onTouchMove: /* repeated */ js.Any => Unit = null,
    onTouchStart: /* repeated */ js.Any => Unit = null,
    opacity: Double | String = null,
    orientation: inner | outer = null,
    overflow: String = null,
    pointerEvents: String = null,
    r: Int | Double = null,
    radius: Percentage | Double = null,
    scale: ScaleType | RechartsFunction = null,
    shapeRendering: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit = null,
    stopColor: String = null,
    stopOpacity: Double | String = null,
    stroke: String = null,
    strokeDasharray: String = null,
    strokeDashoffset: Double | String = null,
    strokeLinecap: String = null,
    strokeLinejoin: String = null,
    strokeMiterlimit: Double | String = null,
    strokeOpacity: Double | String = null,
    strokeWidth: Double | String = null,
    style: js.Object = null,
    textAnchor: String = null,
    textDecoration: String = null,
    textRendering: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit = null,
    tick: Boolean | ContentRenderer[_] | js.Object | ReactElement = null,
    tickFormatter: /* value */ js.Any => js.Any = null,
    tickLine: Boolean | js.Object = null,
    ticks: js.Array[PolarAngleAxisTick] = null,
    transform: String = null,
    `type`: number | category = null,
    unicodeBidi: String = null,
    visibility: String = null,
    width: Int | Double = null,
    wordSpacing: Double | String = null,
    writingMode: String = null,
    x: Int | Double = null,
    y: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.mod.PolarAngleAxis] = {
    val __obj = js.Dynamic.literal()
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (angleAxisId != null) __obj.updateDynamic("angleAxisId")(angleAxisId.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (axisLineType != null) __obj.updateDynamic("axisLineType")(axisLineType.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (colorProfile != null) __obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (enableBackground != null) __obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (glyphOrientationHorizontal != null) __obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (imageRendering != null) __obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textRendering != null) __obj.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1(tickFormatter))
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unicodeBidi != null) __obj.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (writingMode != null) __obj.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.mod.PolarAngleAxis] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.mod.PolarAngleAxis](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PolarAngleAxisProps
}

