package typingsSlinky.reactDashAutocomplete.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reactDashAutocomplete.reactDashAutocompleteMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashAutocomplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-autocomplete", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: open */
  def apply(
    getItemValue: js.Any => String,
    items: js.Array[_],
    renderItem: (js.Any, Boolean, js.UndefOr[CSSProperties]) => TagMod[Any],
    value: js.Any,
    autoHighlight: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    inputProps: HTMLProps[HTMLInputElement] = null,
    isItemSelectable: /* item */ js.Any => Boolean = null,
    menuStyle: CSSProperties = null,
    onChange: (/* e */ ChangeEvent[HTMLInputElement], /* value */ String) => Unit = null,
    onMenuVisibilityChange: /* isOpen */ Boolean => Unit = null,
    onSelect: (/* value */ String, /* item */ js.Any) => Unit = null,
    renderInput: /* props */ HTMLProps[HTMLInputElement] => TagMod[Any] = null,
    renderMenu: (/* items */ js.Array[TagMod[Any]], /* value */ String, /* styles */ CSSProperties) => TagMod[Any] = null,
    selectOnBlur: js.UndefOr[Boolean] = js.undefined,
    shouldItemRender: (/* item */ js.Any, /* value */ String) => Boolean = null,
    sortItems: (/* a */ js.Any, /* b */ js.Any, /* value */ String) => Double = null,
    wrapperProps: HTMLProps[HTMLDivElement] = null,
    wrapperStyle: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(getItemValue = js.Any.fromFunction1(getItemValue), items = items.asInstanceOf[js.Any], renderItem = js.Any.fromFunction3(renderItem), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHighlight)) __obj.updateDynamic("autoHighlight")(autoHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (isItemSelectable != null) __obj.updateDynamic("isItemSelectable")(js.Any.fromFunction1(isItemSelectable))
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onMenuVisibilityChange != null) __obj.updateDynamic("onMenuVisibilityChange")(js.Any.fromFunction1(onMenuVisibilityChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (renderInput != null) __obj.updateDynamic("renderInput")(js.Any.fromFunction1(renderInput))
    if (renderMenu != null) __obj.updateDynamic("renderMenu")(js.Any.fromFunction3(renderMenu))
    if (!js.isUndefined(selectOnBlur)) __obj.updateDynamic("selectOnBlur")(selectOnBlur.asInstanceOf[js.Any])
    if (shouldItemRender != null) __obj.updateDynamic("shouldItemRender")(js.Any.fromFunction2(shouldItemRender))
    if (sortItems != null) __obj.updateDynamic("sortItems")(js.Any.fromFunction3(sortItems))
    if (wrapperProps != null) __obj.updateDynamic("wrapperProps")(wrapperProps.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashAutocomplete.reactDashAutocompleteMod.Props
}

