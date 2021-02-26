package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsSlinky.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Sticky", "Sticky")
  @js.native
  class Sticky protected ()
    extends typingsSlinky.officeUiFabricReact.stickyStickyMod.Sticky {
    def this(props: IStickyProps) = this()
  }
  /* static members */
  object Sticky {
    
    @JSImport("office-ui-fabric-react/lib/components/Sticky", "Sticky")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Sticky", "Sticky.contextType")
    @js.native
    def contextType: Context[IScrollablePaneContext] = js.native
    @scala.inline
    def contextType_=(x: Context[IScrollablePaneContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Sticky", "Sticky.defaultProps")
    @js.native
    def defaultProps: IStickyProps = js.native
    @scala.inline
    def defaultProps_=(x: IStickyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Sticky", "StickyPositionType")
  @js.native
  object StickyPositionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType with Double] = js.native
    
    /* 0 */ val Both: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Both with Double = js.native
    
    /* 2 */ val Footer: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Footer with Double = js.native
    
    /* 1 */ val Header: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Header with Double = js.native
  }
}
