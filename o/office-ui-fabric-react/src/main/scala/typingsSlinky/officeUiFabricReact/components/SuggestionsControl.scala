package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsControl
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsControl[js.Any]] {
  @JSImport("office-ui-fabric-react", "SuggestionsControl")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[T](
    completeSuggestion: () => Unit,
    onSuggestionClick: (js.UndefOr[SyntheticMouseEvent[HTMLElement]], js.UndefOr[js.Any], js.UndefOr[Double]) => Unit,
    shouldLoopSelection: Boolean,
    suggestions: js.Array[ISuggestionModel[T]],
    componentRef: IRefObject[js.Object] = null,
    footerItemsProps: js.Array[ISuggestionsHeaderFooterProps] = null,
    headerItemsProps: js.Array[ISuggestionsHeaderFooterProps] = null,
    onRenderSuggestion: (T, /* suggestionItemProps */ ISuggestionItemProps[T]) => ReactElement = null,
    onSuggestionRemove: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[IPersonaProps], /* index */ js.UndefOr[Double]) => Unit = null,
    resultsMaximumNumber: Int | Double = null,
    shouldSelectFirstItem: () => Boolean = null,
    showRemoveButtons: js.UndefOr[Boolean] = js.undefined,
    suggestionsAvailableAlertText: String = null,
    suggestionsContainerAriaLabel: String = null,
    suggestionsFooterContainerAriaLabel: String = null,
    suggestionsHeaderContainerAriaLabel: String = null,
    suggestionsItemClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsControl[js.Any]] = {
    val __obj = js.Dynamic.literal(completeSuggestion = js.Any.fromFunction0(completeSuggestion), onSuggestionClick = js.Any.fromFunction3(onSuggestionClick), shouldLoopSelection = shouldLoopSelection.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (footerItemsProps != null) __obj.updateDynamic("footerItemsProps")(footerItemsProps.asInstanceOf[js.Any])
    if (headerItemsProps != null) __obj.updateDynamic("headerItemsProps")(headerItemsProps.asInstanceOf[js.Any])
    if (onRenderSuggestion != null) __obj.updateDynamic("onRenderSuggestion")(js.Any.fromFunction2(onRenderSuggestion))
    if (onSuggestionRemove != null) __obj.updateDynamic("onSuggestionRemove")(js.Any.fromFunction3(onSuggestionRemove))
    if (resultsMaximumNumber != null) __obj.updateDynamic("resultsMaximumNumber")(resultsMaximumNumber.asInstanceOf[js.Any])
    if (shouldSelectFirstItem != null) __obj.updateDynamic("shouldSelectFirstItem")(js.Any.fromFunction0(shouldSelectFirstItem))
    if (!js.isUndefined(showRemoveButtons)) __obj.updateDynamic("showRemoveButtons")(showRemoveButtons.asInstanceOf[js.Any])
    if (suggestionsAvailableAlertText != null) __obj.updateDynamic("suggestionsAvailableAlertText")(suggestionsAvailableAlertText.asInstanceOf[js.Any])
    if (suggestionsContainerAriaLabel != null) __obj.updateDynamic("suggestionsContainerAriaLabel")(suggestionsContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsFooterContainerAriaLabel != null) __obj.updateDynamic("suggestionsFooterContainerAriaLabel")(suggestionsFooterContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsHeaderContainerAriaLabel != null) __obj.updateDynamic("suggestionsHeaderContainerAriaLabel")(suggestionsHeaderContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsItemClassName != null) __obj.updateDynamic("suggestionsItemClassName")(suggestionsItemClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.mod.SuggestionsControl[js.Any]]]
  }
  type Props = ISuggestionsControlProps[js.Any]
}

