package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facepileMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "Facepile")
  @js.native
  val Facepile: ReactComponentClass[IFacepileProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase")
  @js.native
  class FacepileBase protected ()
    extends typingsSlinky.officeUiFabricReact.facepileBaseMod.FacepileBase {
    def this(props: IFacepileProps) = this()
  }
  /* static members */
  object FacepileBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase.defaultProps")
    @js.native
    def defaultProps: IFacepileProps = js.native
    @scala.inline
    def defaultProps_=(x: IFacepileProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "OverflowButtonType")
  @js.native
  object OverflowButtonType extends StObject {
    
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
