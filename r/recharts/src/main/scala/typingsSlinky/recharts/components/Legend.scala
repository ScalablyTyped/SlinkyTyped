package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.AnonWidth
import typingsSlinky.recharts.PartialMargin
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.IconType
import typingsSlinky.recharts.mod.LayoutType
import typingsSlinky.recharts.mod.LegendPayload
import typingsSlinky.recharts.mod.LegendProps
import typingsSlinky.recharts.rechartsStrings.bottom
import typingsSlinky.recharts.rechartsStrings.center
import typingsSlinky.recharts.rechartsStrings.left
import typingsSlinky.recharts.rechartsStrings.middle
import typingsSlinky.recharts.rechartsStrings.right
import typingsSlinky.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Legend
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.mod.Legend] {
  @JSImport("recharts", "Legend")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: left | center | right = null,
    chartHeight: Int | Double = null,
    chartWidth: Int | Double = null,
    content: ReactElement | ContentRenderer[LegendProps] = null,
    formatter: (/* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => js.Any = null,
    height: Int | Double = null,
    iconSize: Int | Double = null,
    iconType: IconType = null,
    layout: LayoutType = null,
    margin: PartialMargin = null,
    onBBoxUpdate: /* box */ AnonWidth => Unit = null,
    onClick: /* repeated */ js.Any => Unit = null,
    onMouseEnter: /* repeated */ js.Any => Unit = null,
    onMouseLeave: /* repeated */ js.Any => Unit = null,
    payload: js.Array[LegendPayload] = null,
    verticalAlign: top | middle | bottom = null,
    width: Int | Double = null,
    wrapperStyle: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.mod.Legend] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (chartHeight != null) __obj.updateDynamic("chartHeight")(chartHeight.asInstanceOf[js.Any])
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction3(formatter))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onBBoxUpdate != null) __obj.updateDynamic("onBBoxUpdate")(js.Any.fromFunction1(onBBoxUpdate))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.mod.Legend] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.mod.Legend](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LegendProps
}

