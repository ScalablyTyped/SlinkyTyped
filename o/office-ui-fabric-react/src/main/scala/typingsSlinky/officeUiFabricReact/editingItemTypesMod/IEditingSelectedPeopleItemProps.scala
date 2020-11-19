package typingsSlinky.officeUiFabricReact.editingItemTypesMod

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditingSelectedPeopleItemProps extends ISelectedPeopleItemProps {
  
  var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.native
  
  var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.native
  
  def onEditingComplete(oldItem: js.Any, newItem: js.Any): Unit = js.native
  
  var onRenderFloatingPicker: js.UndefOr[ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]] = js.native
}
object IEditingSelectedPeopleItemProps {
  
  @scala.inline
  def apply(onEditingComplete: (js.Any, js.Any) => Unit): IEditingSelectedPeopleItemProps = {
    val __obj = js.Dynamic.literal(onEditingComplete = js.Any.fromFunction2(onEditingComplete))
    __obj.asInstanceOf[IEditingSelectedPeopleItemProps]
  }
  
  @scala.inline
  implicit class IEditingSelectedPeopleItemPropsOps[Self <: IEditingSelectedPeopleItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnEditingComplete(value: (js.Any, js.Any) => Unit): Self = this.set("onEditingComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFloatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): Self = this.set("floatingPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingPickerProps: Self = this.set("floatingPickerProps", js.undefined)
    
    @scala.inline
    def setGetEditingItemText(value: /* item */ IExtendedPersonaProps => String): Self = this.set("getEditingItemText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetEditingItemText: Self = this.set("getEditingItemText", js.undefined)
    
    @scala.inline
    def setOnRenderFloatingPickerFunctionComponent(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = this.set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRenderFloatingPickerComponentClass(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = this.set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRenderFloatingPicker(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = this.set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRenderFloatingPicker: Self = this.set("onRenderFloatingPicker", js.undefined)
  }
}
