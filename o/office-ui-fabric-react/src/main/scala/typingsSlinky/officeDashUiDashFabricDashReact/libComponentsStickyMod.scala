package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneContext
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.IStickyProps
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Sticky", JSImport.Namespace)
@js.native
object libComponentsStickyMod extends js.Object {
  @js.native
  class Sticky protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsStickyStickyMod.Sticky {
    def this(props: IStickyProps) = this()
  }
  
  /* static members */
  @js.native
  object Sticky extends js.Object {
    var contextType: Context[IScrollablePaneContext] = js.native
    var defaultProps: IStickyProps = js.native
  }
  
  @js.native
  object StickyPositionType extends js.Object {
    /* 0 */ val Both: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Both with Double = js.native
    /* 2 */ val Footer: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Footer with Double = js.native
    /* 1 */ val Header: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Header with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType with Double
      ] = js.native
  }
  
}

