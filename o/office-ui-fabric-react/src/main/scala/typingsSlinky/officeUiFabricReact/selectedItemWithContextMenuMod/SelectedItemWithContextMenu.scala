package typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
@js.native
class SelectedItemWithContextMenu protected ()
  extends Component[ISelectedItemWithContextMenuProps, IPeoplePickerItemState, js.Any] {
  def this(props: ISelectedItemWithContextMenuProps) = this()
  
  var _onClick: js.Any = js.native
  
  var _onCloseContextualMenu: js.Any = js.native
  
  var itemElement: ReactRef[HTMLDivElement] = js.native
}
