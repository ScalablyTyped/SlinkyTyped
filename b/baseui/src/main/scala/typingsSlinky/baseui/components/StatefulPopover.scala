package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonClose
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.close
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.open
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.popoverMod.Overrides
import typingsSlinky.baseui.popoverMod.State
import typingsSlinky.baseui.popoverMod.StatefulPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPopover
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/popover", "StatefulPopover")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, id */
  def apply(
    accessibilityType: none | menu | tooltip = null,
    animateOutTime: Int | Double = null,
    content: TagMod[Any] | (js.Function1[/* args */ AnonClose, TagMod[Any]]) = null,
    `data-baseweb`: String = null,
    dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    dismissOnEsc: js.UndefOr[Boolean] = js.undefined,
    focusLock: js.UndefOr[Boolean] = js.undefined,
    ignoreBoundary: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    mountNode: HTMLElement = null,
    onClose: () => _ = null,
    onMouseEnterDelay: Int | Double = null,
    onMouseLeaveDelay: Int | Double = null,
    onOpen: () => _ = null,
    overrides: Overrides = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State = null,
    triggerType: click | hover = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (animateOutTime != null) __obj.updateDynamic("animateOutTime")(animateOutTime.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnClickOutside)) __obj.updateDynamic("dismissOnClickOutside")(dismissOnClickOutside.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnEsc)) __obj.updateDynamic("dismissOnEsc")(dismissOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(focusLock)) __obj.updateDynamic("focusLock")(focusLock.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onMouseEnterDelay != null) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.asInstanceOf[js.Any])
    if (onMouseLeaveDelay != null) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StatefulPopoverProps
}

