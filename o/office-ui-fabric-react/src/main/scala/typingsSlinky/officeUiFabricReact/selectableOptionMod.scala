package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectableOptionMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption", "SelectableOptionMenuItemType")
  @js.native
  object SelectableOptionMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType with Double
      ] = js.native
    
    /* 1 */ val Divider: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    
    /* 2 */ val Header: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption", "getAllSelectedOptions")
  @js.native
  def getAllSelectedOptions(options: js.Array[ISelectableOption], selectedIndices: js.Array[Double]): js.Array[ISelectableOption] = js.native
}
