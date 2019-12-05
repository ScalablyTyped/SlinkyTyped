package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod.IComboBox
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod.IComboBoxProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/VirtualizedComboBox", JSImport.Namespace)
@js.native
object libComponentsComboBoxVirtualizedComboBoxMod extends js.Object {
  @js.native
  class VirtualizedComboBox ()
    extends BaseComponent[IComboBoxProps, js.Object]
       with IComboBox {
    /** The combo box element */
    var _comboBox: js.Any = js.native
    /** The virtualized list element */
    var _list: js.Any = js.native
    /* protected */ def _onRenderList(props: IComboBoxProps): Element = js.native
    /* protected */ def _onScrollToItem(itemIndex: Double): Unit = js.native
  }
  
}

