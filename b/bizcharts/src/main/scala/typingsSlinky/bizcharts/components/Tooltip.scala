package typingsSlinky.bizcharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.bizcharts.AnonStyle
import typingsSlinky.bizcharts.mod.PositionType
import typingsSlinky.bizcharts.mod.TooltipProps
import typingsSlinky.bizcharts.mod.triggerOnType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.bizcharts.mod.Tooltip] {
  @JSImport("bizcharts", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title, type */
  def apply(
    containerTpl: String = null,
    crosshairs: AnonStyle | Boolean = null,
    enterable: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    `g2-tooltip`: CSSProperties = null,
    `g2-tooltip-list`: CSSProperties = null,
    `g2-tooltip-list-item`: CSSProperties = null,
    `g2-tooltip-marker`: CSSProperties = null,
    `g2-tooltip-title`: CSSProperties = null,
    htmlContent: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]]) => String = null,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    itemTpl: String = null,
    offset: Int | Double = null,
    position: PositionType = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    triggerOn: triggerOnType = null,
    useHtml: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Tooltip] = {
    val __obj = js.Dynamic.literal()
    if (containerTpl != null) __obj.updateDynamic("containerTpl")(containerTpl.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(enterable)) __obj.updateDynamic("enterable")(enterable.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (`g2-tooltip` != null) __obj.updateDynamic("g2-tooltip")(`g2-tooltip`.asInstanceOf[js.Any])
    if (`g2-tooltip-list` != null) __obj.updateDynamic("g2-tooltip-list")(`g2-tooltip-list`.asInstanceOf[js.Any])
    if (`g2-tooltip-list-item` != null) __obj.updateDynamic("g2-tooltip-list-item")(`g2-tooltip-list-item`.asInstanceOf[js.Any])
    if (`g2-tooltip-marker` != null) __obj.updateDynamic("g2-tooltip-marker")(`g2-tooltip-marker`.asInstanceOf[js.Any])
    if (`g2-tooltip-title` != null) __obj.updateDynamic("g2-tooltip-title")(`g2-tooltip-title`.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(js.Any.fromFunction2(htmlContent))
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Tooltip] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.bizcharts.mod.Tooltip](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TooltipProps
}

