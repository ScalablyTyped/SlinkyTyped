package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsSlinky.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Sticky", JSImport.Namespace)
@js.native
object stickyMod extends js.Object {
  
  @js.native
  class Sticky protected ()
    extends typingsSlinky.officeUiFabricReact.stickyStickyMod.Sticky {
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType with Double] = js.native
    
    /* 0 */ val Both: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Both with Double = js.native
    
    /* 2 */ val Footer: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Footer with Double = js.native
    
    /* 1 */ val Header: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Header with Double = js.native
  }
}
