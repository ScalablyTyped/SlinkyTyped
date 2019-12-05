package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod.IComboBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ComboBox", JSImport.Namespace)
@js.native
object libComboBoxMod extends js.Object {
  @js.native
  class ComboBox protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsComboBoxMod.ComboBox {
    def this(props: IComboBoxProps) = this()
  }
  
  @js.native
  class VirtualizedComboBox ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsComboBoxVirtualizedComboBoxMod.VirtualizedComboBox
  
  /* static members */
  @js.native
  object ComboBox extends js.Object {
    var defaultProps: IComboBoxProps = js.native
  }
  
  @js.native
  object SelectableOptionMenuItemType extends js.Object {
    /* 1 */ val Divider: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType with Double
      ] = js.native
  }
  
}

