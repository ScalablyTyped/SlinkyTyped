package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.pivotItemTypesMod.IPivotItemProps
import typingsSlinky.officeUiFabricReact.pivotTypesMod.IPivotProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "Pivot")
  @js.native
  val Pivot: ReactComponentClass[IPivotProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotBase")
  @js.native
  class PivotBase protected ()
    extends typingsSlinky.officeUiFabricReact.pivotBaseMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotItem")
  @js.native
  class PivotItem protected ()
    extends typingsSlinky.officeUiFabricReact.pivotItemMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotLinkFormat")
  @js.native
  object PivotLinkFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkFormat with Double] = js.native
    
    /* 0 */ val links: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.links with Double = js.native
    
    /* 1 */ val tabs: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.tabs with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotLinkSize")
  @js.native
  object PivotLinkSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkSize with Double] = js.native
    
    /* 1 */ val large: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkSize.large with Double = js.native
    
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkSize.normal with Double = js.native
  }
}
