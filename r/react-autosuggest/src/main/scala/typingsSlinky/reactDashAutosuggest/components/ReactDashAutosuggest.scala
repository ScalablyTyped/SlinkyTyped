package typingsSlinky.reactDashAutosuggest.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.FormEvent
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestBooleans.`false`
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestBooleans.`true`
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.AutosuggestProps
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.InputProps
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.RenderSuggestionParams
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.RenderSuggestionsContainerParams
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.SuggestionHighlightedParams
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.SuggestionSelectedEventData
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.SuggestionsFetchRequestedParams
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.Theme
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashAutosuggest
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^[js.Any, js.Any]] {
  @JSImport("react-autosuggest", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def AutosuggestPropsSingleSection[T, T2](
    getSuggestionValue: T => String,
    inputProps: InputProps[T],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (T, /* params */ RenderSuggestionParams) => TagMod[Any],
    suggestions: js.Array[T],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    multiSection: `false` = null,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Unit = null,
    onSuggestionSelected: (/* event */ FormEvent[js.Any], /* data */ SuggestionSelectedEventData[T]) => Unit = null,
    onSuggestionsClearRequested: () => Unit = null,
    renderInputComponent: /* inputProps */ InputProps[T] => TagMod[Any] = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => TagMod[Any] = null,
    shouldRenderSuggestions: /* value */ String => Boolean = null,
    theme: Theme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^[js.Any, js.Any]] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (multiSection != null) __obj.updateDynamic("multiSection")(multiSection.asInstanceOf[js.Any])
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1(onSuggestionHighlighted))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2(onSuggestionSelected))
    if (onSuggestionsClearRequested != null) __obj.updateDynamic("onSuggestionsClearRequested")(js.Any.fromFunction0(onSuggestionsClearRequested))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1(renderInputComponent))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1(renderSuggestionsContainer))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(shouldRenderSuggestions))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.^[js.Any, js.Any]]]
  }
  def AutosuggestPropsMultiSection[T, T2](
    getSuggestionValue: T => String,
    inputProps: InputProps[T],
    multiSection: `true`,
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (T, /* params */ RenderSuggestionParams) => TagMod[Any],
    suggestions: js.Array[T2],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    getSectionSuggestions: T2 => js.Array[T] = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Unit = null,
    onSuggestionSelected: (/* event */ FormEvent[js.Any], /* data */ SuggestionSelectedEventData[T]) => Unit = null,
    onSuggestionsClearRequested: () => Unit = null,
    renderInputComponent: /* inputProps */ InputProps[T] => TagMod[Any] = null,
    renderSectionTitle: /* section */ js.Any => TagMod[Any] = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => TagMod[Any] = null,
    shouldRenderSuggestions: /* value */ String => Boolean = null,
    theme: Theme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^[js.Any, js.Any]] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = multiSection.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick.asInstanceOf[js.Any])
    if (getSectionSuggestions != null) __obj.updateDynamic("getSectionSuggestions")(js.Any.fromFunction1(getSectionSuggestions))
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1(onSuggestionHighlighted))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2(onSuggestionSelected))
    if (onSuggestionsClearRequested != null) __obj.updateDynamic("onSuggestionsClearRequested")(js.Any.fromFunction0(onSuggestionsClearRequested))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1(renderInputComponent))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction1(renderSectionTitle))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1(renderSuggestionsContainer))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(shouldRenderSuggestions))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod.^[js.Any, js.Any]]]
  }
  type Props = AutosuggestProps[js.Any, js.Any]
}

