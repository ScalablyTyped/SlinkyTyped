package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.Anon_Input
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPicker
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerSuggestionProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.IPeopleFloatingPickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IPeopleFloatingPickerProps640656798[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, onChange */
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | Null | js.Thenable[js.Array[IPersonaProps]],
    suggestionsStore: SuggestionsStore[IPersonaProps],
    calloutWidth: Int | Double = null,
    componentRef: IRefObject[IBaseFloatingPicker] = null,
    createGenericItem: (/* input */ String, /* isValid */ Boolean) => ISuggestionModel[IPersonaProps] = null,
    getTextFromItem: (IPersonaProps, /* currentValue */ js.UndefOr[String]) => String = null,
    inputElement: HTMLInputElement = null,
    onInputChanged: /* filter */ String => Unit = null,
    onRemoveSuggestion: IPersonaProps => Unit = null,
    onRenderSuggestionsItem: (IPersonaProps, /* itemProps */ ISuggestionItemProps[IPersonaProps]) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    onSuggestionsHidden: () => Unit = null,
    onSuggestionsShown: () => Unit = null,
    onValidateInput: /* input */ String => Boolean = null,
    onZeroQuerySuggestion: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]] | Null = null,
    pickerSuggestionsProps: IBaseFloatingPickerSuggestionProps = null,
    resolveDelay: Int | Double = null,
    searchingText: (js.Function1[/* props */ Anon_Input, String]) | String = null,
    selectedItems: js.Array[IPersonaProps] = null,
    showForceResolve: () => Boolean = null,
    suggestionItems: js.Array[IPersonaProps] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions), suggestionsStore = suggestionsStore.asInstanceOf[js.Any])
    if (calloutWidth != null) __obj.updateDynamic("calloutWidth")(calloutWidth.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2(createGenericItem))
    if (getTextFromItem != null) __obj.updateDynamic("getTextFromItem")(js.Any.fromFunction2(getTextFromItem))
    if (inputElement != null) __obj.updateDynamic("inputElement")(inputElement.asInstanceOf[js.Any])
    if (onInputChanged != null) __obj.updateDynamic("onInputChanged")(js.Any.fromFunction1(onInputChanged))
    if (onRemoveSuggestion != null) __obj.updateDynamic("onRemoveSuggestion")(js.Any.fromFunction1(onRemoveSuggestion))
    if (onRenderSuggestionsItem != null) __obj.updateDynamic("onRenderSuggestionsItem")(js.Any.fromFunction2(onRenderSuggestionsItem))
    if (onSuggestionsHidden != null) __obj.updateDynamic("onSuggestionsHidden")(js.Any.fromFunction0(onSuggestionsHidden))
    if (onSuggestionsShown != null) __obj.updateDynamic("onSuggestionsShown")(js.Any.fromFunction0(onSuggestionsShown))
    if (onValidateInput != null) __obj.updateDynamic("onValidateInput")(js.Any.fromFunction1(onValidateInput))
    if (onZeroQuerySuggestion != null) __obj.updateDynamic("onZeroQuerySuggestion")(js.Any.fromFunction1(onZeroQuerySuggestion))
    if (pickerSuggestionsProps != null) __obj.updateDynamic("pickerSuggestionsProps")(pickerSuggestionsProps.asInstanceOf[js.Any])
    if (resolveDelay != null) __obj.updateDynamic("resolveDelay")(resolveDelay.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (showForceResolve != null) __obj.updateDynamic("showForceResolve")(js.Any.fromFunction0(showForceResolve))
    if (suggestionItems != null) __obj.updateDynamic("suggestionItems")(suggestionItems.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IPeopleFloatingPickerProps
}

