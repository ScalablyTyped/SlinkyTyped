package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libKeyCodesMod.KeyCodes
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestions
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionsProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Suggestions
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libPickersMod.Suggestions[js.Any]
    ] {
  @JSImport("office-ui-fabric-react/lib/Pickers", "Suggestions")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[T](
    onRenderSuggestion: (T, ISuggestionItemProps[T]) => typingsSlinky.react.reactMod._Global_.JSX.Element,
    onSuggestionClick: (js.UndefOr[SyntheticMouseEvent[HTMLElement]], js.UndefOr[js.Any], js.UndefOr[Double]) => Unit,
    suggestions: js.Array[ISuggestionModel[T]],
    componentRef: IRefObject[ISuggestions[T]] = null,
    createGenericItem: () => Unit = null,
    forceResolveText: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.undefined,
    isResultsFooterVisible: js.UndefOr[Boolean] = js.undefined,
    isSearching: js.UndefOr[Boolean] = js.undefined,
    loadingText: String = null,
    moreSuggestionsAvailable: js.UndefOr[Boolean] = js.undefined,
    mostRecentlyUsedHeaderText: String = null,
    noResultsFoundText: String = null,
    onGetMoreResults: () => Unit = null,
    onRenderNoResultFound: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[Unit], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onSuggestionRemove: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[T | IPersonaProps], /* index */ js.UndefOr[Double]) => Unit = null,
    refocusSuggestions: /* keyCode */ KeyCodes => Unit = null,
    removeSuggestionAriaLabel: String = null,
    resultsFooter: /* props */ ISuggestionsProps[T] => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    resultsFooterFull: /* props */ ISuggestionsProps[T] => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    resultsMaximumNumber: Int | Double = null,
    searchErrorText: String = null,
    searchForMoreText: String = null,
    searchingText: String = null,
    showForceResolve: () => Boolean = null,
    showRemoveButtons: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[_, _] = null,
    suggestionsAvailableAlertText: String = null,
    suggestionsClassName: String = null,
    suggestionsContainerAriaLabel: String = null,
    suggestionsHeaderText: String = null,
    suggestionsItemClassName: String = null,
    suggestionsListId: String = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libPickersMod.Suggestions[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(onRenderSuggestion = js.Any.fromFunction2(onRenderSuggestion), onSuggestionClick = js.Any.fromFunction3(onSuggestionClick), suggestions = suggestions.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction0(createGenericItem))
    if (forceResolveText != null) __obj.updateDynamic("forceResolveText")(forceResolveText.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(isMostRecentlyUsedVisible)) __obj.updateDynamic("isMostRecentlyUsedVisible")(isMostRecentlyUsedVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isResultsFooterVisible)) __obj.updateDynamic("isResultsFooterVisible")(isResultsFooterVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearching)) __obj.updateDynamic("isSearching")(isSearching.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(moreSuggestionsAvailable)) __obj.updateDynamic("moreSuggestionsAvailable")(moreSuggestionsAvailable.asInstanceOf[js.Any])
    if (mostRecentlyUsedHeaderText != null) __obj.updateDynamic("mostRecentlyUsedHeaderText")(mostRecentlyUsedHeaderText.asInstanceOf[js.Any])
    if (noResultsFoundText != null) __obj.updateDynamic("noResultsFoundText")(noResultsFoundText.asInstanceOf[js.Any])
    if (onGetMoreResults != null) __obj.updateDynamic("onGetMoreResults")(js.Any.fromFunction0(onGetMoreResults))
    if (onRenderNoResultFound != null) __obj.updateDynamic("onRenderNoResultFound")(js.Any.fromFunction2(onRenderNoResultFound))
    if (onSuggestionRemove != null) __obj.updateDynamic("onSuggestionRemove")(js.Any.fromFunction3(onSuggestionRemove))
    if (refocusSuggestions != null) __obj.updateDynamic("refocusSuggestions")(js.Any.fromFunction1(refocusSuggestions))
    if (removeSuggestionAriaLabel != null) __obj.updateDynamic("removeSuggestionAriaLabel")(removeSuggestionAriaLabel.asInstanceOf[js.Any])
    if (resultsFooter != null) __obj.updateDynamic("resultsFooter")(js.Any.fromFunction1(resultsFooter))
    if (resultsFooterFull != null) __obj.updateDynamic("resultsFooterFull")(js.Any.fromFunction1(resultsFooterFull))
    if (resultsMaximumNumber != null) __obj.updateDynamic("resultsMaximumNumber")(resultsMaximumNumber.asInstanceOf[js.Any])
    if (searchErrorText != null) __obj.updateDynamic("searchErrorText")(searchErrorText.asInstanceOf[js.Any])
    if (searchForMoreText != null) __obj.updateDynamic("searchForMoreText")(searchForMoreText.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    if (showForceResolve != null) __obj.updateDynamic("showForceResolve")(js.Any.fromFunction0(showForceResolve))
    if (!js.isUndefined(showRemoveButtons)) __obj.updateDynamic("showRemoveButtons")(showRemoveButtons.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (suggestionsAvailableAlertText != null) __obj.updateDynamic("suggestionsAvailableAlertText")(suggestionsAvailableAlertText.asInstanceOf[js.Any])
    if (suggestionsClassName != null) __obj.updateDynamic("suggestionsClassName")(suggestionsClassName.asInstanceOf[js.Any])
    if (suggestionsContainerAriaLabel != null) __obj.updateDynamic("suggestionsContainerAriaLabel")(suggestionsContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsHeaderText != null) __obj.updateDynamic("suggestionsHeaderText")(suggestionsHeaderText.asInstanceOf[js.Any])
    if (suggestionsItemClassName != null) __obj.updateDynamic("suggestionsItemClassName")(suggestionsItemClassName.asInstanceOf[js.Any])
    if (suggestionsListId != null) __obj.updateDynamic("suggestionsListId")(suggestionsListId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libPickersMod.Suggestions[js.Any]]]
  }
  type Props = ISuggestionsProps[js.Any]
}

