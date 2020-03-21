package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsCore
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsCore[js.Any]] {
  @JSImport("office-ui-fabric-react", "SuggestionsCore")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    onSuggestionClick: (js.UndefOr[SyntheticMouseEvent[HTMLElement]], js.UndefOr[js.Any], js.UndefOr[Double]) => Unit,
    shouldLoopSelection: Boolean,
    suggestions: js.Array[ISuggestionModel[T]],
    componentRef: IRefObject[js.Object] = null,
    onRenderSuggestion: (T, /* suggestionItemProps */ ISuggestionItemProps[T]) => ReactElement = null,
    onSuggestionRemove: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[IPersonaProps], /* index */ js.UndefOr[Double]) => Unit = null,
    resultsMaximumNumber: Int | Double = null,
    showRemoveButtons: js.UndefOr[Boolean] = js.undefined,
    suggestionsAvailableAlertText: String = null,
    suggestionsContainerAriaLabel: String = null,
    suggestionsItemClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsCore[js.Any]] = {
    val __obj = js.Dynamic.literal(onSuggestionClick = js.Any.fromFunction3(onSuggestionClick), shouldLoopSelection = shouldLoopSelection.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (onRenderSuggestion != null) __obj.updateDynamic("onRenderSuggestion")(js.Any.fromFunction2(onRenderSuggestion))
    if (onSuggestionRemove != null) __obj.updateDynamic("onSuggestionRemove")(js.Any.fromFunction3(onSuggestionRemove))
    if (resultsMaximumNumber != null) __obj.updateDynamic("resultsMaximumNumber")(resultsMaximumNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveButtons)) __obj.updateDynamic("showRemoveButtons")(showRemoveButtons.asInstanceOf[js.Any])
    if (suggestionsAvailableAlertText != null) __obj.updateDynamic("suggestionsAvailableAlertText")(suggestionsAvailableAlertText.asInstanceOf[js.Any])
    if (suggestionsContainerAriaLabel != null) __obj.updateDynamic("suggestionsContainerAriaLabel")(suggestionsContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsItemClassName != null) __obj.updateDynamic("suggestionsItemClassName")(suggestionsItemClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.mod.SuggestionsCore[js.Any]]]
  }
  type Props = ISuggestionsCoreProps[js.Any]
}

