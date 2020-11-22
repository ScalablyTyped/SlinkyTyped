package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIPanelState
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelState
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Panel", JSImport.Namespace)
@js.native
object libPanelMod extends js.Object {
  
  val Panel: ReactComponentClass[IPanelProps] = js.native
  
  @js.native
  class PanelBase protected ()
    extends typingsSlinky.officeUiFabricReact.panelMod.PanelBase {
    def this(props: IPanelProps) = this()
  }
  /* static members */
  @js.native
  object PanelBase extends js.Object {
    
    var defaultProps: IPanelProps = js.native
    
    def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = js.native
  }
  
  @js.native
  object PanelType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType with Double] = js.native
    
    /* 7 */ val custom: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.custom with Double = js.native
    
    /* 8 */ val customNear: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.customNear with Double = js.native
    
    /* 6 */ val extraLarge: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.extraLarge with Double = js.native
    
    /* 4 */ val large: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.large with Double = js.native
    
    /* 5 */ val largeFixed: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.largeFixed with Double = js.native
    
    /* 3 */ val medium: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.medium with Double = js.native
    
    /* 1 */ val smallFixedFar: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.smallFixedFar with Double = js.native
    
    /* 2 */ val smallFixedNear: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.smallFixedNear with Double = js.native
    
    /* 0 */ val smallFluid: typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType.smallFluid with Double = js.native
  }
  
  @js.native
  object PanelVisibilityState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.panelBaseMod.PanelVisibilityState with Double] = js.native
    
    /* 3 */ val animatingClosed: typingsSlinky.officeUiFabricReact.panelBaseMod.PanelVisibilityState.animatingClosed with Double = js.native
    
    /* 1 */ val animatingOpen: typingsSlinky.officeUiFabricReact.panelBaseMod.PanelVisibilityState.animatingOpen with Double = js.native
    
    /* 0 */ val closed: typingsSlinky.officeUiFabricReact.panelBaseMod.PanelVisibilityState.closed with Double = js.native
    
    /* 2 */ val open: typingsSlinky.officeUiFabricReact.panelBaseMod.PanelVisibilityState.open with Double = js.native
  }
}
