package typingsSlinky.officeUiFabricReact.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsList
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typingsSlinky.officeUiFabricReact.libSelectionMod.Selection
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ISelectedPeopleProps528717756[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def canRemoveItem(value: IExtendedPersonaProps => Boolean): this.type = set("canRemoveItem", js.Any.fromFunction1(value))
  
  @scala.inline
  def componentRefFunction1(value: /* ref */ IBaseSelectedItemsList[IExtendedPersonaProps] | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def componentRefRefObject(value: ReactRef[IBaseSelectedItemsList[IExtendedPersonaProps]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def componentRef(value: IRefObject[IBaseSelectedItemsList[IExtendedPersonaProps]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def copyMenuItemText(value: String): this.type = set("copyMenuItemText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def createGenericItem(
    value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[IExtendedPersonaProps]
  ): this.type = set("createGenericItem", js.Any.fromFunction2(value))
  
  @scala.inline
  def defaultSelectedItemsVarargs(value: IExtendedPersonaProps*): this.type = set("defaultSelectedItems", js.Array(value :_*))
  
  @scala.inline
  def defaultSelectedItems(value: js.Array[IExtendedPersonaProps]): this.type = set("defaultSelectedItems", value.asInstanceOf[js.Any])
  
  @scala.inline
  def editMenuItemText(value: String): this.type = set("editMenuItemText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def floatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): this.type = set("floatingPickerProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getEditingItemText(value: /* item */ IExtendedPersonaProps => String): this.type = set("getEditingItemText", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(value: /* items */ js.UndefOr[js.Array[IExtendedPersonaProps]] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCopyItems(value: /* items */ js.Array[IExtendedPersonaProps] => String): this.type = set("onCopyItems", js.Any.fromFunction1(value))
  
  @scala.inline
  def onExpandGroup(value: /* item */ IExtendedPersonaProps => Unit): this.type = set("onExpandGroup", js.Any.fromFunction1(value))
  
  @scala.inline
  def onItemDeleted(value: IExtendedPersonaProps => Unit): this.type = set("onItemDeleted", js.Any.fromFunction1(value))
  
  @scala.inline
  def onItemSelected(
    value: /* selectedItem */ js.UndefOr[IExtendedPersonaProps] => IExtendedPersonaProps | js.Thenable[IExtendedPersonaProps]
  ): this.type = set("onItemSelected", js.Any.fromFunction1(value))
  
  @scala.inline
  def onItemsDeleted(value: /* deletedItems */ js.Array[IExtendedPersonaProps] => Unit): this.type = set("onItemsDeleted", js.Any.fromFunction1(value))
  
  @scala.inline
  def onRenderFloatingPickerFunctionComponent(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): this.type = set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onRenderFloatingPickerComponentClass(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): this.type = set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onRenderFloatingPicker(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): this.type = set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onRenderItem(value: /* props */ ISelectedItemProps[IExtendedPersonaProps] => ReactElement): this.type = set("onRenderItem", js.Any.fromFunction1(value))
  
  @scala.inline
  def removeButtonAriaLabel(value: String): this.type = set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def removeMenuItemText(value: String): this.type = set("removeMenuItemText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedItemsVarargs(value: IExtendedPersonaProps*): this.type = set("selectedItems", js.Array(value :_*))
  
  @scala.inline
  def selectedItems(value: js.Array[IExtendedPersonaProps]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selection(value: Selection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
}
