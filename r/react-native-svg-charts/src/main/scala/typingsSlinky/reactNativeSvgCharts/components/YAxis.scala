package typingsSlinky.reactNativeSvgCharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.d3Scale.mod.ScaleBand_
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvgCharts.AnonTop
import typingsSlinky.reactNativeSvgCharts.PartialTextProps
import typingsSlinky.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsSlinky.reactNativeSvgCharts.mod.ScaleType
import typingsSlinky.reactNativeSvgCharts.mod.YAxisProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object YAxis
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeSvgCharts.mod.YAxis[js.Any]] {
  @JSImport("react-native-svg-charts", "YAxis")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    data: js.Array[T],
    contentInset: AnonTop = null,
    formatLabel: (/* value */ js.Any, /* index */ Double) => Double | String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    numberOfTicks: Int | Double = null,
    scale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialTextProps = null,
    yAccessor: /* props */ AccessorFunctionProps[T] => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.YAxis[js.Any]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction0(scale))
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1(yAccessor))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeSvgCharts.mod.YAxis[js.Any]]]
  }
  type Props = YAxisProps[js.Any]
}

