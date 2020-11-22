package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.officeUiFabricReact.anon.PartialIPanelState
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelState
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
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
@JSImport("office-ui-fabric-react", "PanelBase")
@js.native
object PanelBase extends js.Object {
  
  var defaultProps: IPanelProps = js.native
  
  def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = js.native
}
