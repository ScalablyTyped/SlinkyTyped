package typingsSlinky.officeUiFabricReact.indexBundleMod

import typingsSlinky.officeUiFabricReact.anon.IsSelectedOnFocus
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "SelectionZone")
@js.native
class SelectionZone protected ()
  extends typingsSlinky.officeUiFabricReact.mod.SelectionZone {
  def this(props: ISelectionZoneProps) = this()
}
/* static members */
object SelectionZone {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "SelectionZone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "SelectionZone.defaultProps")
  @js.native
  def defaultProps: IsSelectedOnFocus = js.native
  @scala.inline
  def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "SelectionZone.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}
