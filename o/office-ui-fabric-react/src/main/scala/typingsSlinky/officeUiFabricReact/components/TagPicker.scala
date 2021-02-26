package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.anon.Input
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePicker
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
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
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagPicker {
  
  @scala.inline
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[ITag]]) => js.Array[ITag] | js.Thenable[js.Array[ITag]]
  ): Builder = {
    val __props = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions))
    new Builder(js.Array(this.component, __props.asInstanceOf[IBasePickerProps[ITag]]))
  }
  
  @JSImport("office-ui-fabric-react", "TagPicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Any with js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IBasePicker[ITag]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IBasePicker[ITag] | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IBasePicker[ITag]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def createGenericItem(
      value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[ITag] | ITag
    ): this.type = set("createGenericItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def defaultSelectedItems(value: js.Array[ITag]): this.type = set("defaultSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelectedItemsVarargs(value: ITag*): this.type = set("defaultSelectedItems", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableSelectedSuggestionAlert(value: Boolean): this.type = set("enableSelectedSuggestionAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getTextFromItem(value: (ITag, /* currentValue */ js.UndefOr[String]) => String): this.type = set("getTextFromItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def inputProps(value: IInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemLimit(value: Double): this.type = set("itemLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(
      value: SyntheticFocusEvent[HTMLInputElement | typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill] => Unit
    ): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* items */ js.UndefOr[js.Array[ITag]] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDismiss(value: (/* ev */ js.UndefOr[js.Any], /* selectedItem */ js.UndefOr[ITag]) => Boolean | Unit): this.type = set("onDismiss", js.Any.fromFunction2(value))
    
    @scala.inline
    def onEmptyInputFocus(
      value: /* selectedItems */ js.UndefOr[js.Array[ITag]] => js.Array[ITag] | js.Thenable[js.Array[ITag]]
    ): this.type = set("onEmptyInputFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptyResolveSuggestions(
      value: /* selectedItems */ js.UndefOr[js.Array[ITag]] => js.Array[ITag] | js.Thenable[js.Array[ITag]]
    ): this.type = set("onEmptyResolveSuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(
      value: SyntheticFocusEvent[HTMLInputElement | typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill] => Unit
    ): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onGetMoreResults(
      value: (/* filter */ String, /* selectedItems */ js.UndefOr[js.Array[ITag]]) => js.Array[ITag] | js.Thenable[js.Array[ITag]]
    ): this.type = set("onGetMoreResults", js.Any.fromFunction2(value))
    
    @scala.inline
    def onInputChange(value: /* input */ String => String): this.type = set("onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemSelected(value: /* selectedItem */ js.UndefOr[ITag] => ITag | js.Thenable[ITag] | Null): this.type = set("onItemSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRemoveSuggestion(value: ITag => Unit): this.type = set("onRemoveSuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRenderItem(value: /* props */ IPickerItemProps[ITag] => ReactElement): this.type = set("onRenderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRenderSuggestionsItem(value: (ITag, /* itemProps */ ISuggestionItemProps[ITag]) => ReactElement): this.type = set("onRenderSuggestionsItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def onValidateInput(value: /* input */ String => ValidationState): this.type = set("onValidateInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def pickerCalloutProps(value: ICalloutProps): this.type = set("pickerCalloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pickerSuggestionsProps(value: IBasePickerSuggestionsProps[_]): this.type = set("pickerSuggestionsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeButtonAriaLabel(value: String): this.type = set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resolveDelay(value: Double): this.type = set("resolveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchingText(value: (js.Function1[/* props */ Input, String]) | String): this.type = set("searchingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchingTextFunction1(value: /* props */ Input => String): this.type = set("searchingText", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedItems(value: js.Array[ITag]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedItemsVarargs(value: ITag*): this.type = set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IBasePickerStyleProps, IBasePickerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IBasePickerStyleProps => DeepPartial[IBasePickerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBasePickerProps[ITag]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
