package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.officeUiFabricReact.anon.PartialIPanelState
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelState
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "PanelBase")
@js.native
class PanelBase protected ()
  extends typingsSlinky.officeUiFabricReact.libPanelMod.PanelBase {
  def this(props: IPanelProps) = this()
}
/* static members */
object PanelBase {
  
  @JSImport("office-ui-fabric-react", "PanelBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "PanelBase.defaultProps")
  @js.native
  def defaultProps: IPanelProps = js.native
  @scala.inline
  def defaultProps_=(x: IPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "PanelBase.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = js.native
}
