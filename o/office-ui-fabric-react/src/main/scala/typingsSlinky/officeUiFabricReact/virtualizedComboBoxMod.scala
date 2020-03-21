package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBox
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import typingsSlinky.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/VirtualizedComboBox", JSImport.Namespace)
@js.native
object virtualizedComboBoxMod extends js.Object {
  @js.native
  class VirtualizedComboBox ()
    extends BaseComponent[IComboBoxProps, js.Object]
       with IComboBox {
    /** The combo box element */
    var _comboBox: js.Any = js.native
    /** The virtualized list element */
    var _list: js.Any = js.native
    /* protected */ def _onRenderList(props: IComboBoxProps): ReactElement = js.native
    /* protected */ def _onScrollToItem(itemIndex: Double): Unit = js.native
  }
  
}

