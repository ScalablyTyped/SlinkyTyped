package typingsSlinky.recharts.components

import org.scalajs.dom.raw.CanvasRenderingContext2D
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.d3Path.mod.Path_
import typingsSlinky.d3Shape.mod.CurveGenerator
import typingsSlinky.recharts.anon.DotPropspayloadany
import typingsSlinky.recharts.mod.AnimationEasingType
import typingsSlinky.recharts.mod.AreaProps
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.DataKey
import typingsSlinky.recharts.mod.LayoutType
import typingsSlinky.recharts.mod.LegendType
import typingsSlinky.recharts.mod.LineType
import typingsSlinky.recharts.mod.Point
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
import typingsSlinky.recharts.rechartsStrings.crispEdges
import typingsSlinky.recharts.rechartsStrings.geometricPrecision
import typingsSlinky.recharts.rechartsStrings.inherit
import typingsSlinky.recharts.rechartsStrings.lighter
import typingsSlinky.recharts.rechartsStrings.normal
import typingsSlinky.recharts.rechartsStrings.optimizeLegibility
import typingsSlinky.recharts.rechartsStrings.optimizeQuality
import typingsSlinky.recharts.rechartsStrings.optimizeSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Area {
  
  @JSImport("recharts", "Area")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.Area] {
    
    @scala.inline
    def activeDotReactElement(value: ReactElement): this.type = set("activeDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeDotFunction1(value: _ => ReactElement): this.type = set("activeDot", js.Any.fromFunction1(value))
    
    @scala.inline
    def activeDot(value: Boolean | js.Object | ReactElement | ContentRenderer[_]): this.type = set("activeDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignmentBaseline(value: String): this.type = set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def angle(value: Double): this.type = set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationBegin(value: Double): this.type = set("animationBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationEasing(value: AnimationEasingType): this.type = set("animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationId(value: Double): this.type = set("animationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseLineVarargs(value: js.Any*): this.type = set("baseLine", js.Array(value :_*))
    
    @scala.inline
    def baseLine(value: Double | js.Array[_]): this.type = set("baseLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baselineShift(value: String): this.type = set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clip(value: String): this.type = set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipRule(value: String): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorInterpolation(value: String): this.type = set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorInterpolationFilters(value: String): this.type = set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorProfile(value: String): this.type = set("colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorRendering(value: String): this.type = set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def connectNulls(value: Boolean): this.type = set("connectNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursor(value: String): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def display(value: String): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dominantBaseline(value: String): this.type = set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotReactElement(value: ReactElement): this.type = set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotFunction1(value: DotPropspayloadany => ReactElement): this.type = set("dot", js.Any.fromFunction1(value))
    
    @scala.inline
    def dot(value: Boolean | js.Object | ReactElement | ContentRenderer[DotPropspayloadany]): this.type = set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dx(value: Double): this.type = set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dy(value: Double): this.type = set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillOpacity(value: Double | String): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRule(value: String): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: String): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floodColor(value: String): this.type = set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floodOpacity(value: String): this.type = set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def font(value: String): this.type = set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: Double | String): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSizeAdjust(value: Double | String): this.type = set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStretch(value: String): this.type = set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyle(value: String): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariant(value: String): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeight(
      value: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
    ): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def glyphOrientationVertical(value: String): this.type = set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageRendering(value: auto | optimizeSpeed | optimizeQuality | inherit): this.type = set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isAnimationActive(value: Boolean): this.type = set("isAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isRange(value: Boolean): this.type = set("isRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isUpdateAnimationActive(value: Boolean): this.type = set("isUpdateAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kerning(value: Double | String): this.type = set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFunction1(value: _ => ReactElement): this.type = set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def label(value: Boolean | js.Object | ContentRenderer[_] | ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: LayoutType): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legendType(value: LegendType): this.type = set("legendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacing(value: String): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lightingColor(value: String): this.type = set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerEnd(value: String): this.type = set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerMid(value: String): this.type = set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerStart(value: String): this.type = set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String | Double): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationEnd(value: /* repeated */ js.Any => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(value: /* repeated */ js.Any => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: /* repeated */ js.Any => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: /* repeated */ js.Any => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: /* repeated */ js.Any => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: /* repeated */ js.Any => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: /* repeated */ js.Any => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: /* repeated */ js.Any => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: /* repeated */ js.Any => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: /* repeated */ js.Any => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: /* repeated */ js.Any => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: /* repeated */ js.Any => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: /* repeated */ js.Any => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: /* repeated */ js.Any => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def opacity(value: Double | String): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflow(value: String): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: String): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointsVarargs(value: Point*): this.type = set("points", js.Array(value :_*))
    
    @scala.inline
    def points(value: js.Array[Point]): this.type = set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def r(value: Double): this.type = set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shapeRendering(value: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit): this.type = set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stackId(value: String | Double): this.type = set("stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopColor(value: String): this.type = set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopOpacity(value: Double | String): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: Double | String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharray(value: String): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDashoffset(value: Double | String): this.type = set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinecap(value: String): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinejoin(value: String): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeMiterlimit(value: Double | String): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeOpacity(value: Double | String): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double | String): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAnchor(value: String): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textRendering(value: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit): this.type = set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeFunction1(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): this.type = set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def `type`(value: LineType): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unicodeBidi(value: String): this.type = set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: String | Double): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibility(value: String): this.type = set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wordSpacing(value: Double | String): this.type = set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def writingMode(value: String): this.type = set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xAxis(value: js.Object): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xAxisId(value: String | Double): this.type = set("xAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yAxis(value: js.Object): this.type = set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yAxisId(value: String | Double): this.type = set("yAxisId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(dataKey: DataKey): Builder = {
    val __props = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AreaProps]))
  }
}
