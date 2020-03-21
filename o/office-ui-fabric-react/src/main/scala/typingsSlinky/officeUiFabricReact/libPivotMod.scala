package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.pivotItemTypesMod.IPivotItemProps
import typingsSlinky.officeUiFabricReact.pivotTypesMod.IPivotProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Pivot", JSImport.Namespace)
@js.native
object libPivotMod extends js.Object {
  @js.native
  class PivotBase protected ()
    extends typingsSlinky.officeUiFabricReact.pivotMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @js.native
  class PivotItem protected ()
    extends typingsSlinky.officeUiFabricReact.pivotMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  val Pivot: ReactComponentClass[IPivotProps] = js.native
  @js.native
  object PivotLinkFormat extends js.Object {
    /* 0 */ val links: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.links with Double = js.native
    /* 1 */ val tabs: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.tabs with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkFormat with Double] = js.native
  }
  
  @js.native
  object PivotLinkSize extends js.Object {
    /* 1 */ val large: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkSize.large with Double = js.native
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkSize.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.pivotTypesMod.PivotLinkSize with Double] = js.native
  }
  
}

