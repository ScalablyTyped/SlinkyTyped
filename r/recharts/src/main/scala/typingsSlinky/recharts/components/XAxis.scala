package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.AxisDomain
import typingsSlinky.recharts.rechartsMod.AxisInterval
import typingsSlinky.recharts.rechartsMod.ContentRenderer
import typingsSlinky.recharts.rechartsMod.DataKey
import typingsSlinky.recharts.rechartsMod.LabelProps
import typingsSlinky.recharts.rechartsMod.RechartsFunction
import typingsSlinky.recharts.rechartsMod.ScaleType
import typingsSlinky.recharts.rechartsMod.XAxisProps
import typingsSlinky.recharts.rechartsMod.XPadding
import typingsSlinky.recharts.rechartsStrings.bottom
import typingsSlinky.recharts.rechartsStrings.category
import typingsSlinky.recharts.rechartsStrings.number
import typingsSlinky.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object XAxis
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.XAxis] {
  @JSImport("recharts", "XAxis")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, reversed */
  def apply(
    allowDataOverflow: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    allowDuplicatedCategory: js.UndefOr[Boolean] = js.undefined,
    angle: Int | Double = null,
    axisLine: Boolean | js.Object = null,
    dataKey: DataKey = null,
    domain: js.Tuple2[AxisDomain, AxisDomain] = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    height: Int | Double = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    interval: AxisInterval = null,
    label: String | Double | typingsSlinky.recharts.rechartsMod.Label | LabelProps = null,
    minTickGap: Int | Double = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    name: String | Double = null,
    orientation: top | bottom = null,
    padding: XPadding = null,
    scale: ScaleType | RechartsFunction = null,
    stroke: String = null,
    textAnchor: String = null,
    tick: Boolean | ContentRenderer[_] | js.Object | ReactElement = null,
    tickCount: Int | Double = null,
    tickFormatter: /* value */ js.Any => js.Any = null,
    tickLine: Boolean | js.Object = null,
    tickMargin: Int | Double = null,
    tickSize: Int | Double = null,
    ticks: js.Array[_] = null,
    `type`: number | category = null,
    unit: String | Double = null,
    width: Int | Double = null,
    xAxisId: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.XAxis] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDataOverflow)) __obj.updateDynamic("allowDataOverflow")(allowDataOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDuplicatedCategory)) __obj.updateDynamic("allowDuplicatedCategory")(allowDuplicatedCategory.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minTickGap != null) __obj.updateDynamic("minTickGap")(minTickGap.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1(tickFormatter))
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (tickMargin != null) __obj.updateDynamic("tickMargin")(tickMargin.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.XAxis] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.rechartsMod.XAxis](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = XAxisProps
}

