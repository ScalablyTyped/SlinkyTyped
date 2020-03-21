package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.officeUiFabricReact.AnonInput
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePicker
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerStyleProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerStyles
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IInputProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagPicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSImport("office-ui-fabric-react", "TagPicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, key */
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[ITag]]) => js.Array[ITag] | js.Thenable[js.Array[ITag]],
    componentRef: IRefObject[IBasePicker[ITag]] = null,
    createGenericItem: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[ITag] | ITag = null,
    defaultSelectedItems: js.Array[ITag] = null,
    enableSelectedSuggestionAlert: js.UndefOr[Boolean] = js.undefined,
    getTextFromItem: (ITag, /* currentValue */ js.UndefOr[String]) => String = null,
    inputProps: IInputProps = null,
    itemLimit: Int | Double = null,
    onBlur: SyntheticFocusEvent[
      HTMLInputElement | typingsSlinky.officeUiFabricReact.baseAutoFillMod.BaseAutoFill
    ] => Unit = null,
    onChange: /* items */ js.UndefOr[js.Array[ITag]] => Unit = null,
    onDismiss: (/* ev */ js.UndefOr[js.Any], /* selectedItem */ js.UndefOr[ITag]) => Unit = null,
    onEmptyInputFocus: /* selectedItems */ js.UndefOr[js.Array[ITag]] => js.Array[ITag] | js.Thenable[js.Array[ITag]] = null,
    onEmptyResolveSuggestions: /* selectedItems */ js.UndefOr[js.Array[ITag]] => js.Array[ITag] | js.Thenable[js.Array[ITag]] = null,
    onFocus: SyntheticFocusEvent[
      HTMLInputElement | typingsSlinky.officeUiFabricReact.baseAutoFillMod.BaseAutoFill
    ] => Unit = null,
    onGetMoreResults: (/* filter */ String, /* selectedItems */ js.UndefOr[js.Array[ITag]]) => js.Array[ITag] | js.Thenable[js.Array[ITag]] = null,
    onInputChange: /* input */ String => String = null,
    onItemSelected: /* selectedItem */ js.UndefOr[ITag] => ITag | js.Thenable[ITag] | Null = null,
    onRemoveSuggestion: ITag => Unit = null,
    onRenderItem: /* props */ IPickerItemProps[ITag] => ReactElement = null,
    onRenderSuggestionsItem: (ITag, /* itemProps */ ISuggestionItemProps[ITag]) => ReactElement = null,
    onValidateInput: /* input */ String => ValidationState = null,
    pickerCalloutProps: ICalloutProps = null,
    pickerSuggestionsProps: IBasePickerSuggestionsProps[_] = null,
    removeButtonAriaLabel: String = null,
    resolveDelay: Int | Double = null,
    searchingText: (js.Function1[/* props */ AnonInput, String]) | String = null,
    selectedItems: js.Array[ITag] = null,
    styles: IStyleFunctionOrObject[IBasePickerStyleProps, IBasePickerStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2(createGenericItem))
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectedSuggestionAlert)) __obj.updateDynamic("enableSelectedSuggestionAlert")(enableSelectedSuggestionAlert.asInstanceOf[js.Any])
    if (getTextFromItem != null) __obj.updateDynamic("getTextFromItem")(js.Any.fromFunction2(getTextFromItem))
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (itemLimit != null) __obj.updateDynamic("itemLimit")(itemLimit.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2(onDismiss))
    if (onEmptyInputFocus != null) __obj.updateDynamic("onEmptyInputFocus")(js.Any.fromFunction1(onEmptyInputFocus))
    if (onEmptyResolveSuggestions != null) __obj.updateDynamic("onEmptyResolveSuggestions")(js.Any.fromFunction1(onEmptyResolveSuggestions))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onGetMoreResults != null) __obj.updateDynamic("onGetMoreResults")(js.Any.fromFunction2(onGetMoreResults))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1(onItemSelected))
    if (onRemoveSuggestion != null) __obj.updateDynamic("onRemoveSuggestion")(js.Any.fromFunction1(onRemoveSuggestion))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1(onRenderItem))
    if (onRenderSuggestionsItem != null) __obj.updateDynamic("onRenderSuggestionsItem")(js.Any.fromFunction2(onRenderSuggestionsItem))
    if (onValidateInput != null) __obj.updateDynamic("onValidateInput")(js.Any.fromFunction1(onValidateInput))
    if (pickerCalloutProps != null) __obj.updateDynamic("pickerCalloutProps")(pickerCalloutProps.asInstanceOf[js.Any])
    if (pickerSuggestionsProps != null) __obj.updateDynamic("pickerSuggestionsProps")(pickerSuggestionsProps.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (resolveDelay != null) __obj.updateDynamic("resolveDelay")(resolveDelay.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITagPickerProps
}

