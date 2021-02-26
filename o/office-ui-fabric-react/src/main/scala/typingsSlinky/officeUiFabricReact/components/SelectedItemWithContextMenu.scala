package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod.ISelectedItemWithContextMenuProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectedItemWithContextMenu {
  
  @scala.inline
  def apply(item: IExtendedPersonaProps, menuItems: js.Array[IContextualMenuItem], renderedItem: ReactElement): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISelectedItemWithContextMenuProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod.SelectedItemWithContextMenu
        ] {
    
    @scala.inline
    def beginEditing(value: /* item */ IExtendedPersonaProps => Unit): this.type = set("beginEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRef(value: IRefObject[js.Any]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ js.Any | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[js.Any]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISelectedItemWithContextMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
