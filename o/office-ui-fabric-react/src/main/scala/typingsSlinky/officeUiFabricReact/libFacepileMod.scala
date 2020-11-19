package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Facepile", JSImport.Namespace)
@js.native
object libFacepileMod extends js.Object {
  
  val Facepile: ReactComponentClass[IFacepileProps] = js.native
  
  @js.native
  class FacepileBase protected ()
    extends typingsSlinky.officeUiFabricReact.facepileMod.FacepileBase {
    def this(props: IFacepileProps) = this()
  }
  /* static members */
  @js.native
  object FacepileBase extends js.Object {
    
    var defaultProps: IFacepileProps = js.native
  }
  
  @js.native
  object OverflowButtonType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType with Double
      ] = js.native
    
    /* 1 */ val descriptive: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.descriptive with Double = js.native
    
    /* 3 */ val downArrow: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.downArrow with Double = js.native
    
    /* 2 */ val more: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.more with Double = js.native
    
    /* 0 */ val none: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.none with Double = js.native
  }
}
