package typingsSlinky.officeUiFabricReact.editingItemTypesMod

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditingSelectedPeopleItemProps extends ISelectedPeopleItemProps {
  var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.native
  var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.native
  var onRenderFloatingPicker: js.UndefOr[ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]] = js.native
  def onEditingComplete(oldItem: js.Any, newItem: js.Any): Unit = js.native
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
    def withOnEditingComplete(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditingComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFloatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingPickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPickerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEditingItemText(value: /* item */ IExtendedPersonaProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditingItemText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetEditingItemText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditingItemText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderFloatingPickerFunctionComponent(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFloatingPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRenderFloatingPickerComponentClass(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFloatingPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRenderFloatingPicker(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFloatingPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRenderFloatingPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFloatingPicker")(js.undefined)
        ret
    }
  }
  
}

