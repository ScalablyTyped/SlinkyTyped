package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonEmptyState
import typingsSlinky.baseui.AnonItem
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.focus
import typingsSlinky.baseui.baseuiStrings.mouseEnter
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.baseui.menuMod.ItemsT
import typingsSlinky.baseui.menuMod.RenderItemProps
import typingsSlinky.baseui.menuMod.StatefulContainerState
import typingsSlinky.baseui.menuMod.StatefulMenuProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.menuMod.StatefulMenu] {
  @JSImport("baseui/menu", "StatefulMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    items: ItemsT,
    addMenuToNesting: /* ref */ Ref[HTMLElement] => Unit = null,
    getChildMenu: /* ref */ Ref[HTMLElement] => Unit = null,
    getParentMenu: /* ref */ Ref[HTMLElement] => Unit = null,
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps = null,
    initialState: StatefulContainerState = null,
    onItemSelect: /* args */ AnonItem => js.Any = null,
    overrides: AnonEmptyState = null,
    removeMenuFromNesting: /* ref */ Ref[HTMLElement] => Unit = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    rootRef: Ref[_] = null,
    size: String = null,
    stateReducer: (/* changeType */ moveDown | moveUp | reset | click | focus | mouseEnter, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.menuMod.StatefulMenu] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (addMenuToNesting != null) __obj.updateDynamic("addMenuToNesting")(js.Any.fromFunction1(addMenuToNesting))
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (getParentMenu != null) __obj.updateDynamic("getParentMenu")(js.Any.fromFunction1(getParentMenu))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(js.Any.fromFunction2(getRequiredItemProps))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction1(onItemSelect))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (removeMenuFromNesting != null) __obj.updateDynamic("removeMenuFromNesting")(js.Any.fromFunction1(removeMenuFromNesting))
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StatefulMenuProps
}

