package typingsSlinky.reactDashSelect.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSelect.srcComponentsMenuMod.MenuPortalProps
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.ClassNamesState
import typingsSlinky.reactDashSelect.srcTypesMod.MenuPlacement
import typingsSlinky.reactDashSelect.srcTypesMod.MenuPosition
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuPortal
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSelect.srcComponentsMenuMod.MenuPortal[js.Any]] {
  @JSImport("react-select/src/components/Menu", "MenuPortal")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[OptionType /* <: OptionTypeBase */](
    appendTo: HTMLElement,
    clearValue: () => Unit,
    controlElement: HTMLElement,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => String | Unit,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[OptionType],
    hasValue: Boolean,
    isMulti: Boolean,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition,
    options: OptionsType[OptionType],
    selectOption: OptionType => Unit,
    selectProps: typingsSlinky.reactDashSelect.srcSelectMod.Props[OptionType],
    setValue: (ValueType[OptionType], ActionTypes) => Unit,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSelect.srcComponentsMenuMod.MenuPortal[js.Any]] = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], clearValue = js.Any.fromFunction0(clearValue), controlElement = controlElement.asInstanceOf[js.Any], cx = js.Any.fromFunction3(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSelect.srcComponentsMenuMod.MenuPortal[js.Any]]]
  }
  type Props = MenuPortalProps[js.Any]
}

