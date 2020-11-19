package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ComboBox", JSImport.Namespace)
@js.native
object comboBoxMod extends js.Object {
  
  @js.native
  class ComboBox protected ()
    extends typingsSlinky.officeUiFabricReact.comboBoxComboBoxMod.ComboBox {
    def this(props: IComboBoxProps) = this()
  }
  /* static members */
  @js.native
  object ComboBox extends js.Object {
    
    var defaultProps: IComboBoxProps = js.native
  }
  
  @js.native
  object SelectableOptionMenuItemType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType with Double
      ] = js.native
    
    /* 1 */ val Divider: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    
    /* 2 */ val Header: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
  }
  
  @js.native
  class VirtualizedComboBox protected ()
    extends typingsSlinky.officeUiFabricReact.virtualizedComboBoxMod.VirtualizedComboBox {
    def this(props: IComboBoxProps) = this()
  }
}
