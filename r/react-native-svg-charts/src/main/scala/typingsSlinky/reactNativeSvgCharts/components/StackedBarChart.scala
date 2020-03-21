package typingsSlinky.reactNativeSvgCharts.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.d3Path.mod.Path_
import typingsSlinky.d3Scale.mod.ScaleBand_
import typingsSlinky.d3Shape.mod.CurveGenerator
import typingsSlinky.d3Shape.mod.Series
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvg.mod.LinearGradientProps
import typingsSlinky.reactNativeSvg.mod.RadialGradientProps
import typingsSlinky.reactNativeSvgCharts.AnonBottom
import typingsSlinky.reactNativeSvgCharts.AnonId
import typingsSlinky.reactNativeSvgCharts.PartialPathProps
import typingsSlinky.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsSlinky.reactNativeSvgCharts.mod.GridProps
import typingsSlinky.reactNativeSvgCharts.mod.ScaleType
import typingsSlinky.reactNativeSvgCharts.mod.StackedBarChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackedBarChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeSvgCharts.mod.StackedBarChart[js.Any]] {
  @JSImport("react-native-svg-charts", "StackedBarChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    colors: js.Array[String],
    data: js.Array[T],
    keys: js.Array[String],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    contentInset: AnonBottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator = null,
    extra: () => js.Object = null,
    extras: js.Array[_] = null,
    gridMax: Int | Double = null,
    gridMin: Int | Double = null,
    gridProps: GridProps[_] = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    numberOfTicks: Int | Double = null,
    offset: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit = null,
    order: /* series */ Series[js.Any, js.Any] => js.Array[Double] = null,
    renderGradient: /* props */ AnonId => ReactComponentClass[LinearGradientProps | RadialGradientProps] = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    strokeColor: String = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialPathProps = null,
    width: Int | Double = null,
    xAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    xMax: Int | Double = null,
    xMin: Int | Double = null,
    xScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    yAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    yMax: Int | Double = null,
    yMin: Int | Double = null,
    yScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.StackedBarChart[js.Any]] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1(curve))
    if (extra != null) __obj.updateDynamic("extra")(js.Any.fromFunction0(extra))
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(js.Any.fromFunction2(offset))
    if (order != null) __obj.updateDynamic("order")(js.Any.fromFunction1(order))
    if (renderGradient != null) __obj.updateDynamic("renderGradient")(js.Any.fromFunction1(renderGradient))
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1(xAccessor))
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction0(xScale))
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1(yAccessor))
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction0(yScale))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeSvgCharts.mod.StackedBarChart[js.Any]]]
  }
  type Props = StackedBarChartProps[js.Any]
}

