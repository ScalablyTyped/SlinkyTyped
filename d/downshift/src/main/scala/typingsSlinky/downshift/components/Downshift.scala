package typingsSlinky.downshift.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.downshift.downshiftMod.A11yStatusMessageOptions
import typingsSlinky.downshift.downshiftMod.ControllerStateAndHelpers
import typingsSlinky.downshift.downshiftMod.DownshiftProps
import typingsSlinky.downshift.downshiftMod.DownshiftState
import typingsSlinky.downshift.downshiftMod.Environment
import typingsSlinky.downshift.downshiftMod.StateChangeOptions
import typingsSlinky.downshift.downshiftMod.default
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Downshift
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("downshift", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    defaultHighlightedIndex: Int | Double = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    environment: Environment = null,
    getA11yStatusMessage: /* options */ A11yStatusMessageOptions[js.Any] => String = null,
    getItemId: /* index */ js.UndefOr[Double] => String = null,
    highlightedIndex: Int | Double = null,
    initialHighlightedIndex: Int | Double = null,
    initialInputValue: String = null,
    initialIsOpen: js.UndefOr[Boolean] = js.undefined,
    initialSelectedItem: js.Any = null,
    inputId: String = null,
    inputValue: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemCount: Int | Double = null,
    itemToString: /* item */ js.Any | Null => String = null,
    labelId: String = null,
    menuId: String = null,
    onChange: (/* selectedItem */ js.Any | Null, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit = null,
    onInputValueChange: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit = null,
    onOuterClick: /* stateAndHelpers */ ControllerStateAndHelpers[js.Any] => Unit = null,
    onSelect: (/* selectedItem */ js.Any | Null, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit = null,
    onStateChange: (/* options */ StateChangeOptions[js.Any], /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit = null,
    onUserAction: (/* options */ StateChangeOptions[js.Any], /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit = null,
    scrollIntoView: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit = null,
    selectedItem: js.Any = null,
    selectedItemChanged: (js.Any, js.Any) => Boolean = null,
    stateReducer: (/* state */ DownshiftState[js.Any], /* changes */ StateChangeOptions[js.Any]) => Partial[StateChangeOptions[js.Any]] = null,
    suppressRefError: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultHighlightedIndex != null) __obj.updateDynamic("defaultHighlightedIndex")(defaultHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (getA11yStatusMessage != null) __obj.updateDynamic("getA11yStatusMessage")(js.Any.fromFunction1(getA11yStatusMessage))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction1(getItemId))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (initialHighlightedIndex != null) __obj.updateDynamic("initialHighlightedIndex")(initialHighlightedIndex.asInstanceOf[js.Any])
    if (initialInputValue != null) __obj.updateDynamic("initialInputValue")(initialInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIsOpen)) __obj.updateDynamic("initialIsOpen")(initialIsOpen.asInstanceOf[js.Any])
    if (initialSelectedItem != null) __obj.updateDynamic("initialSelectedItem")(initialSelectedItem.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1(itemToString))
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInputValueChange != null) __obj.updateDynamic("onInputValueChange")(js.Any.fromFunction2(onInputValueChange))
    if (onOuterClick != null) __obj.updateDynamic("onOuterClick")(js.Any.fromFunction1(onOuterClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2(onStateChange))
    if (onUserAction != null) __obj.updateDynamic("onUserAction")(js.Any.fromFunction2(onUserAction))
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction2(scrollIntoView))
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemChanged != null) __obj.updateDynamic("selectedItemChanged")(js.Any.fromFunction2(selectedItemChanged))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2(stateReducer))
    if (!js.isUndefined(suppressRefError)) __obj.updateDynamic("suppressRefError")(suppressRefError.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.downshift.downshiftMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DownshiftProps[js.Any]
}

