package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.PartialMargin
import typingsSlinky.recharts.mod.BaseValueType
import typingsSlinky.recharts.mod.LayoutType
import typingsSlinky.recharts.mod.LineChartProps
import typingsSlinky.recharts.mod.StackOffsetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LineChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.mod.LineChart] {
  @JSImport("recharts", "LineChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    barCategoryGap: Double | String = null,
    barGap: Double | String = null,
    barSize: Double | String = null,
    baseValue: BaseValueType = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[js.Object] = null,
    height: Int | Double = null,
    layout: LayoutType = null,
    margin: PartialMargin = null,
    maxBarSize: Int | Double = null,
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
    reverseStackOrder: js.UndefOr[Boolean] = js.undefined,
    stackOffset: StackOffsetType = null,
    style: js.Object = null,
    syncId: String | Double = null,
    throttleDelay: Int | Double = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.mod.LineChart] = {
    val __obj = js.Dynamic.literal()
    if (barCategoryGap != null) __obj.updateDynamic("barCategoryGap")(barCategoryGap.asInstanceOf[js.Any])
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (baseValue != null) __obj.updateDynamic("baseValue")(baseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxBarSize != null) __obj.updateDynamic("maxBarSize")(maxBarSize.asInstanceOf[js.Any])
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
    if (!js.isUndefined(reverseStackOrder)) __obj.updateDynamic("reverseStackOrder")(reverseStackOrder.asInstanceOf[js.Any])
    if (stackOffset != null) __obj.updateDynamic("stackOffset")(stackOffset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (syncId != null) __obj.updateDynamic("syncId")(syncId.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.mod.LineChart] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.mod.LineChart](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LineChartProps
}

