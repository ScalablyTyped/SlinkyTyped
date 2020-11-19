package typingsSlinky.officeUiFabricReact.extendedSelectedItemMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/ExtendedSelectedItem", "ExtendedSelectedItem")
@js.native
class ExtendedSelectedItem protected ()
  extends Component[ISelectedPeopleItemProps, IPeoplePickerItemState, js.Any] {
  def this(props: ISelectedPeopleItemProps) = this()
  
  var _onClickIconButton: js.Any = js.native
  
  var persona: ReactRef[HTMLDivElement] = js.native
}
