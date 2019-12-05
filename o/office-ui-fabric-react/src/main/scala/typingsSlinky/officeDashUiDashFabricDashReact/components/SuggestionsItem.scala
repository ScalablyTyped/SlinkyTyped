package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionItemProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionsItem
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionsItemStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionsItemStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsItem
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libPickersMod.SuggestionsItem[js.Any]
    ] {
  @JSImport("office-ui-fabric-react/lib/Pickers", "SuggestionsItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply[T](
    RenderSuggestion: (T, ISuggestionItemProps[T]) => typingsSlinky.react.reactMod._Global_.JSX.Element,
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    onRemoveItem: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    suggestionModel: ISuggestionModel[T],
    componentRef: IRefObject[ISuggestionsItem] = null,
    isSelectedOverride: js.UndefOr[Boolean] = js.undefined,
    removeButtonAriaLabel: String = null,
    showRemoveButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libPickersMod.SuggestionsItem[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(RenderSuggestion = js.Any.fromFunction2(RenderSuggestion), onClick = js.Any.fromFunction1(onClick), onRemoveItem = js.Any.fromFunction1(onRemoveItem), suggestionModel = suggestionModel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectedOverride)) __obj.updateDynamic("isSelectedOverride")(isSelectedOverride.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveButton)) __obj.updateDynamic("showRemoveButton")(showRemoveButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libPickersMod.SuggestionsItem[js.Any]]]
  }
  type Props = ISuggestionItemProps[js.Any]
}

