package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.BaseValueType
import typingsSlinky.recharts.rechartsMod.Margin
import typingsSlinky.recharts.rechartsMod.RadarChartProps
import typingsSlinky.recharts.rechartsMod.StackOffsetType
import typingsSlinky.recharts.rechartsStrings.centric
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadarChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.RadarChart] {
  @JSImport("recharts", "RadarChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart */
  def apply(
    barCategoryGap: Double | String = null,
    barGap: Double | String = null,
    barSize: Double | String = null,
    baseValue: BaseValueType = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    cx: Double | String = null,
    cy: Double | String = null,
    data: js.Array[js.Object] = null,
    endAngle: Int | Double = null,
    height: Int | Double = null,
    innerRadius: Double | String = null,
    layout: centric = null,
    margin: Partial[Margin] = null,
    maxBarSize: Int | Double = null,
    outerRadius: Double | String = null,
    reverseStackOrder: js.UndefOr[Boolean] = js.undefined,
    stackOffset: StackOffsetType = null,
    startAngle: Int | Double = null,
    style: js.Object = null,
    syncId: String | Double = null,
    throttleDelay: Int | Double = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.RadarChart] = {
    val __obj = js.Dynamic.literal()
    if (barCategoryGap != null) __obj.updateDynamic("barCategoryGap")(barCategoryGap.asInstanceOf[js.Any])
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (baseValue != null) __obj.updateDynamic("baseValue")(baseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxBarSize != null) __obj.updateDynamic("maxBarSize")(maxBarSize.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseStackOrder)) __obj.updateDynamic("reverseStackOrder")(reverseStackOrder.asInstanceOf[js.Any])
    if (stackOffset != null) __obj.updateDynamic("stackOffset")(stackOffset.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (syncId != null) __obj.updateDynamic("syncId")(syncId.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.RadarChart] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.rechartsMod.RadarChart](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RadarChartProps
}

