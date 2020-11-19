package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.Input
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPicker
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerSuggestionProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseFloatingPeoplePicker {
  
  @JSImport("office-ui-fabric-react", "BaseFloatingPeoplePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.BaseFloatingPeoplePicker] {
    
    @scala.inline
    def calloutWidth(value: Double): this.type = set("calloutWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IBaseFloatingPicker | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IBaseFloatingPicker]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IBaseFloatingPicker]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def createGenericItem(value: (/* input */ String, /* isValid */ Boolean) => ISuggestionModel[IPersonaProps]): this.type = set("createGenericItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def getTextFromItem(value: (IPersonaProps, /* currentValue */ js.UndefOr[String]) => String): this.type = set("getTextFromItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def inputElement(value: HTMLInputElement): this.type = set("inputElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputElementNull: this.type = set("inputElement", null)
    
    @scala.inline
    def onChange(value: IPersonaProps => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputChanged(value: /* filter */ String => Unit): this.type = set("onInputChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRemoveSuggestion(value: IPersonaProps => Unit): this.type = set("onRemoveSuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRenderSuggestionsItem(value: (IPersonaProps, /* itemProps */ ISuggestionItemProps[IPersonaProps]) => ReactElement): this.type = set("onRenderSuggestionsItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSuggestionsHidden(value: () => Unit): this.type = set("onSuggestionsHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSuggestionsShown(value: () => Unit): this.type = set("onSuggestionsShown", js.Any.fromFunction0(value))
    
    @scala.inline
    def onValidateInput(value: /* input */ String => Boolean): this.type = set("onValidateInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onZeroQuerySuggestion(
      value: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]] | Null
    ): this.type = set("onZeroQuerySuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def pickerCalloutProps(value: ICalloutProps): this.type = set("pickerCalloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pickerSuggestionsProps(value: IBaseFloatingPickerSuggestionProps): this.type = set("pickerSuggestionsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resolveDelay(value: Double): this.type = set("resolveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchingTextFunction1(value: /* props */ Input => String): this.type = set("searchingText", js.Any.fromFunction1(value))
    
    @scala.inline
    def searchingText(value: (js.Function1[/* props */ Input, String]) | String): this.type = set("searchingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedItemsVarargs(value: IPersonaProps*): this.type = set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def selectedItems(value: js.Array[IPersonaProps]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showForceResolve(value: () => Boolean): this.type = set("showForceResolve", js.Any.fromFunction0(value))
    
    @scala.inline
    def suggestionItemsVarargs(value: IPersonaProps*): this.type = set("suggestionItems", js.Array(value :_*))
    
    @scala.inline
    def suggestionItems(value: js.Array[IPersonaProps]): this.type = set("suggestionItems", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBaseFloatingPickerProps[IPersonaProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | Null | js.Thenable[js.Array[IPersonaProps]],
    suggestionsStore: SuggestionsStore[IPersonaProps]
  ): Builder = {
    val __props = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions), suggestionsStore = suggestionsStore.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IBaseFloatingPickerProps[IPersonaProps]]))
  }
}
