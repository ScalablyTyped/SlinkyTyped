package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.IPivotProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotItemDotTypesMod.IPivotItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Pivot", JSImport.Namespace)
@js.native
object libPivotMod extends js.Object {
  @js.native
  class PivotBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @js.native
  class PivotItem protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  val Pivot: ReactComponentClass[IPivotProps] = js.native
  @js.native
  object PivotLinkFormat extends js.Object {
    /* 0 */ val links: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.links with Double = js.native
    /* 1 */ val tabs: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.tabs with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat with Double
      ] = js.native
  }
  
  @js.native
  object PivotLinkSize extends js.Object {
    /* 1 */ val large: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.large with Double = js.native
    /* 0 */ val normal: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize with Double
      ] = js.native
  }
  
}

