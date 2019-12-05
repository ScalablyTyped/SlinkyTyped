package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.Anon_EventItem
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.focus
import typingsSlinky.baseui.baseuiStrings.mouseEnter
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.baseui.menuMod.RenderItemProps
import typingsSlinky.baseui.menuMod.StatefulContainerProps
import typingsSlinky.baseui.menuMod.StatefulContainerState
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.menuMod.StatefulContainer] {
  @JSImport("baseui/menu", "StatefulContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    items: js.Array[_],
    addMenuToNesting: /* ref */ Ref[HTMLElement] => Unit = null,
    getChildMenu: /* ref */ Ref[HTMLElement] => Unit = null,
    getParentMenu: /* ref */ Ref[HTMLElement] => Unit = null,
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps = null,
    initialState: StatefulContainerState = null,
    onItemSelect: /* args */ Anon_EventItem => js.Any = null,
    removeMenuFromNesting: /* ref */ Ref[HTMLElement] => Unit = null,
    rootRef: Ref[_] = null,
    stateReducer: (/* changeType */ moveUp | mouseEnter | focus | click | reset | moveDown, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.menuMod.StatefulContainer] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (addMenuToNesting != null) __obj.updateDynamic("addMenuToNesting")(js.Any.fromFunction1(addMenuToNesting))
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (getParentMenu != null) __obj.updateDynamic("getParentMenu")(js.Any.fromFunction1(getParentMenu))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(js.Any.fromFunction2(getRequiredItemProps))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction1(onItemSelect))
    if (removeMenuFromNesting != null) __obj.updateDynamic("removeMenuFromNesting")(js.Any.fromFunction1(removeMenuFromNesting))
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StatefulContainerProps
}

