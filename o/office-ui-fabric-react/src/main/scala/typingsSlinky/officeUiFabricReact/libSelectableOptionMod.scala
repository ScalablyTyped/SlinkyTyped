package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/SelectableOption", JSImport.Namespace)
@js.native
object libSelectableOptionMod extends js.Object {
  
  def getAllSelectedOptions(options: js.Array[ISelectableOption], selectedIndices: js.Array[Double]): js.Array[ISelectableOption] = js.native
  
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
}
