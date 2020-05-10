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
    def withCopyMenuItemText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyMenuItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyMenuItemText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyMenuItemText")(js.undefined)
        ret
    }
    @scala.inline
    def withEditMenuItemText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMenuItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditMenuItemText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMenuItemText")(js.undefined)
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
    def withOnExpandGroup(value: /* item */ IExtendedPersonaProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExpandGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandGroup")(js.undefined)
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
    @scala.inline
    def withRemoveMenuItemText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMenuItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveMenuItemText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMenuItemText")(js.undefined)
        ret
    }
  }
  
}

