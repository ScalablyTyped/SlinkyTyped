package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod.ISelectedItemWithContextMenuProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectedItemWithContextMenu
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod.SelectedItemWithContextMenu
    ] {
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    item: IExtendedPersonaProps,
    menuItems: js.Array[IContextualMenuItem],
    renderedItem: ReactElement,
    beginEditing: /* item */ IExtendedPersonaProps => Unit = null,
    componentRef: IRefObject[js.Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod.SelectedItemWithContextMenu
  ] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
    if (beginEditing != null) __obj.updateDynamic("beginEditing")(js.Any.fromFunction1(beginEditing))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ISelectedItemWithContextMenuProps
}

