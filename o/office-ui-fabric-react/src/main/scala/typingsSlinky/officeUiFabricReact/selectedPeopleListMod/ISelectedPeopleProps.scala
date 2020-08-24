package typingsSlinky.officeUiFabricReact.selectedPeopleListMod

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectedPeopleProps extends IBaseSelectedItemsListProps[IExtendedPersonaProps] {
  var copyMenuItemText: js.UndefOr[String] = js.native
  var editMenuItemText: js.UndefOr[String] = js.native
  var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.native
  var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.native
  var onExpandGroup: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.native
  var onRenderFloatingPicker: js.UndefOr[ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]] = js.native
  var removeMenuItemText: js.UndefOr[String] = js.native
}

object ISelectedPeopleProps {
  @scala.inline
  def apply(): ISelectedPeopleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectedPeopleProps]
  }
  @scala.inline
  implicit class ISelectedPeoplePropsOps[Self <: ISelectedPeopleProps] (val x: Self) extends AnyVal {
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
    def setCopyMenuItemText(value: String): Self = this.set("copyMenuItemText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyMenuItemText: Self = this.set("copyMenuItemText", js.undefined)
    @scala.inline
    def setEditMenuItemText(value: String): Self = this.set("editMenuItemText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditMenuItemText: Self = this.set("editMenuItemText", js.undefined)
    @scala.inline
    def setFloatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): Self = this.set("floatingPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingPickerProps: Self = this.set("floatingPickerProps", js.undefined)
    @scala.inline
    def setGetEditingItemText(value: /* item */ IExtendedPersonaProps => String): Self = this.set("getEditingItemText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetEditingItemText: Self = this.set("getEditingItemText", js.undefined)
    @scala.inline
    def setOnExpandGroup(value: /* item */ IExtendedPersonaProps => Unit): Self = this.set("onExpandGroup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExpandGroup: Self = this.set("onExpandGroup", js.undefined)
    @scala.inline
    def setOnRenderFloatingPickerFunctionComponent(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = this.set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRenderFloatingPickerComponentClass(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = this.set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRenderFloatingPicker(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = this.set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRenderFloatingPicker: Self = this.set("onRenderFloatingPicker", js.undefined)
    @scala.inline
    def setRemoveMenuItemText(value: String): Self = this.set("removeMenuItemText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveMenuItemText: Self = this.set("removeMenuItemText", js.undefined)
  }
  
}

