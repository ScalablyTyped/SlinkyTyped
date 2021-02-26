package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedSelectedItemMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/ExtendedSelectedItem", "ExtendedSelectedItem")
  @js.native
  class ExtendedSelectedItem protected ()
    extends Component[ISelectedPeopleItemProps, IPeoplePickerItemState, js.Any] {
    def this(props: ISelectedPeopleItemProps) = this()
    
    var _onClickIconButton: js.Any = js.native
    
    var persona: ReactRef[HTMLDivElement] = js.native
  }
  
  @js.native
  trait IPeoplePickerItemState extends StObject {
    
    var contextualMenuVisible: Boolean = js.native
  }
  object IPeoplePickerItemState {
    
    @scala.inline
    def apply(contextualMenuVisible: Boolean): IPeoplePickerItemState = {
      val __obj = js.Dynamic.literal(contextualMenuVisible = contextualMenuVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemState]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemStateMutableBuilder[Self <: IPeoplePickerItemState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextualMenuVisible(value: Boolean): Self = StObject.set(x, "contextualMenuVisible", value.asInstanceOf[js.Any])
    }
  }
}
