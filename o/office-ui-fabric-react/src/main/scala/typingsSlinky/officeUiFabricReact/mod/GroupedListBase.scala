package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.officeUiFabricReact.anon.Compact
import typingsSlinky.officeUiFabricReact.groupedListBaseMod.IGroupedListState
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "GroupedListBase")
@js.native
class GroupedListBase protected ()
  extends typingsSlinky.officeUiFabricReact.libGroupedListMod.GroupedListBase {
  def this(props: IGroupedListProps) = this()
}
/* static members */
object GroupedListBase {
  
  @JSImport("office-ui-fabric-react", "GroupedListBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "GroupedListBase.defaultProps")
  @js.native
  def defaultProps: Compact = js.native
  @scala.inline
  def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "GroupedListBase.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
}
