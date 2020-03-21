package typingsSlinky.reactWidgets.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactWidgets.AnonAction
import typingsSlinky.reactWidgets.AnonLastSearchTerm
import typingsSlinky.reactWidgets.AnonOriginalEvent
import typingsSlinky.reactWidgets.mod.Multiselect.^
import typingsSlinky.reactWidgets.multiselectMod.MultiselectMessages
import typingsSlinky.reactWidgets.multiselectMod.MultiselectProps
import typingsSlinky.reactWidgets.reactWidgetsBooleans.`false`
import typingsSlinky.reactWidgets.reactWidgetsStrings.contains
import typingsSlinky.reactWidgets.reactWidgetsStrings.endsWith
import typingsSlinky.reactWidgets.reactWidgetsStrings.onFilter
import typingsSlinky.reactWidgets.reactWidgetsStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Multiselect
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-widgets", "Multiselect")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, id, open, placeholder */
  def apply(
    allowCreate: Boolean | onFilter = null,
    busy: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    data: js.Array[_] = null,
    defaultValue: js.Array[_] = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    filter: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ String, Boolean]) = null,
    groupBy: String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: ReactComponentClass[_] = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    itemComponent: ReactComponentClass[_] = null,
    listComponent: ReactComponentClass[_] | String = null,
    listProps: js.Object = null,
    messages: MultiselectMessages = null,
    minLength: Int | Double = null,
    onChange: (/* dataItems */ js.Array[_], /* metadata */ AnonAction) => Unit = null,
    onCreate: /* searchTerm */ String => Unit = null,
    onSearch: (/* searchTerm */ String, /* metadata */ AnonLastSearchTerm) => Unit = null,
    onSelect: (/* value */ js.Any, /* metadata */ AnonOriginalEvent) => Unit = null,
    onToggle: /* isOpen */ Boolean => Unit = null,
    popupTransition: ReactComponentClass[_] | String = null,
    readOnly: Boolean | js.Array[_] = null,
    searchTerm: String = null,
    tagComponent: ReactComponentClass[_] | String = null,
    textField: String | (js.Function1[/* dataItem */ js.Any, String]) = null,
    value: js.Array[_] = null,
    valueField: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (allowCreate != null) __obj.updateDynamic("allowCreate")(allowCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (listComponent != null) __obj.updateDynamic("listComponent")(listComponent.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1(onCreate))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm.asInstanceOf[js.Any])
    if (tagComponent != null) __obj.updateDynamic("tagComponent")(tagComponent.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactWidgets.mod.Multiselect.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MultiselectProps
}

