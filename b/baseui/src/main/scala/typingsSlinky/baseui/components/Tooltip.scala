package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.popoverMod.Overrides
import typingsSlinky.baseui.tooltipMod.TooltipProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.tooltipMod.Tooltip] {
  @JSImport("baseui/tooltip", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, id */
  def apply(
    content: TagMod[Any] | js.Function0[TagMod[Any]],
    isOpen: Boolean,
    accessibilityType: none | menu | tooltip = null,
    animateOutTime: Int | Double = null,
    `data-baseweb`: String = null,
    focusLock: js.UndefOr[Boolean] = js.undefined,
    ignoreBoundary: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onBlur: () => _ = null,
    onClick: /* e */ Event_ => _ = null,
    onClickOutside: /* event */ MouseEvent => _ = null,
    onEsc: () => _ = null,
    onFocus: () => _ = null,
    onMouseEnter: () => _ = null,
    onMouseEnterDelay: Int | Double = null,
    onMouseLeave: () => _ = null,
    onMouseLeaveDelay: Int | Double = null,
    overrides: Overrides = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    triggerType: click | hover = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.tooltipMod.Tooltip] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (animateOutTime != null) __obj.updateDynamic("animateOutTime")(animateOutTime.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(focusLock)) __obj.updateDynamic("focusLock")(focusLock.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction0(onEsc))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseEnterDelay != null) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    if (onMouseLeaveDelay != null) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

