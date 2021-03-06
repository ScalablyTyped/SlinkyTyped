package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBox
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualizedComboBoxMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox/VirtualizedComboBox", "VirtualizedComboBox")
  @js.native
  class VirtualizedComboBox protected ()
    extends Component[IComboBoxProps, js.Object, js.Any]
       with IComboBox {
    def this(props: IComboBoxProps) = this()
    
    /** The combo box element */
    var _comboBox: js.Any = js.native
    
    /** The virtualized list element */
    var _list: js.Any = js.native
    
    /* protected */ def _onRenderList(props: IComboBoxProps): ReactElement = js.native
    
    /* protected */ def _onScrollToItem(itemIndex: Double): Unit = js.native
  }
}
