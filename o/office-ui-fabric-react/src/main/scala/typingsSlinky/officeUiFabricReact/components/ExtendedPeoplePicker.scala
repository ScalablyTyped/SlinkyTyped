package typingsSlinky.officeUiFabricReact.components

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExtendedPeoplePicker {
  @JSImport("office-ui-fabric-react", "ExtendedPeoplePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: IBaseExtendedPickerProps[IPersonaProps]): SharedBuilder_IExtendedPeoplePickerProps312011879[typingsSlinky.officeUiFabricReact.mod.ExtendedPeoplePicker] = new SharedBuilder_IExtendedPeoplePickerProps312011879[typingsSlinky.officeUiFabricReact.mod.ExtendedPeoplePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps],
    onRenderFloatingPicker: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]],
    onRenderSelectedItems: ReactComponentClass[IBaseSelectedItemsListProps[IPersonaProps]],
    selectedItemsListProps: IBaseSelectedItemsListProps[IPersonaProps]
  ): SharedBuilder_IExtendedPeoplePickerProps312011879[typingsSlinky.officeUiFabricReact.mod.ExtendedPeoplePicker] = {
    val __props = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
    new SharedBuilder_IExtendedPeoplePickerProps312011879[typingsSlinky.officeUiFabricReact.mod.ExtendedPeoplePicker](js.Array(this.component, __props.asInstanceOf[IBaseExtendedPickerProps[IPersonaProps]]))
  }
}

