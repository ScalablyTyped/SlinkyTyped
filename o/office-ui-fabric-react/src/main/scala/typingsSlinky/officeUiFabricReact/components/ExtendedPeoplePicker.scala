package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPicker
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IInputProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExtendedPeoplePicker {
  
  @scala.inline
  def apply(
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps],
    onRenderFloatingPicker: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]],
    onRenderSelectedItems: ReactComponentClass[IBaseSelectedItemsListProps[IPersonaProps]],
    selectedItemsListProps: IBaseSelectedItemsListProps[IPersonaProps]
  ): Builder = {
    val __props = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IBaseExtendedPickerProps[IPersonaProps]]))
  }
  
  @JSImport("office-ui-fabric-react", "ExtendedPeoplePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ExtendedPeoplePicker] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IBaseExtendedPicker[IPersonaProps]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IBaseExtendedPicker[IPersonaProps] | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IBaseExtendedPicker[IPersonaProps]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentRenderedQueryString(value: String): this.type = set("currentRenderedQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelectedItems(value: js.Array[IPersonaProps]): this.type = set("defaultSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelectedItemsVarargs(value: IPersonaProps*): this.type = set("defaultSelectedItems", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerComponent(value: ReactElement): this.type = set("headerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: IInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemLimit(value: Double): this.type = set("itemLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(
      value: SyntheticFocusEvent[HTMLInputElement | typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill] => Unit
    ): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* items */ js.UndefOr[js.Array[IPersonaProps]] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(
      value: SyntheticFocusEvent[HTMLInputElement | typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill] => Unit
    ): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemAdded(value: IPersonaProps => Unit): this.type = set("onItemAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemSelected(value: /* selectedItem */ js.UndefOr[IPersonaProps] => IPersonaProps | js.Thenable[IPersonaProps]): this.type = set("onItemSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemsRemoved(value: /* removedItems */ js.Array[IPersonaProps] => Unit): this.type = set("onItemsRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(value: /* pastedText */ String => js.Array[IPersonaProps]): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedItems(value: js.Array[IPersonaProps]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedItemsVarargs(value: IPersonaProps*): this.type = set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def suggestionItems(value: js.Array[IPersonaProps]): this.type = set("suggestionItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestionItemsVarargs(value: IPersonaProps*): this.type = set("suggestionItems", js.Array(value :_*))
  }
  
  def withProps(p: IBaseExtendedPickerProps[IPersonaProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
