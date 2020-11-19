package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Compact
import typingsSlinky.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsSlinky.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typingsSlinky.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/GroupedList", JSImport.Namespace)
@js.native
object groupedListMod extends js.Object {
  
  val GroupFooter: ReactComponentClass[IGroupFooterProps] = js.native
  
  val GroupHeader: ReactComponentClass[IGroupHeaderProps] = js.native
  
  val GroupShowAll: ReactComponentClass[IGroupShowAllProps] = js.native
  
  val GroupSpacer: ReactComponentClass[IGroupSpacerProps] = js.native
  
  val GroupedList: ReactComponentClass[IGroupedListProps] = js.native
  
  @js.native
  object CollapseAllVisibility extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
    
    /* 0 */ val hidden: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    
    /* 1 */ val visible: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
  }
  
  @js.native
  class GroupedListBase protected ()
    extends typingsSlinky.officeUiFabricReact.groupedListBaseMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  /* static members */
  @js.native
  object GroupedListBase extends js.Object {
    
    var defaultProps: Compact = js.native
  }
  
  @js.native
  class GroupedListSection protected ()
    extends typingsSlinky.officeUiFabricReact.groupedListSectionMod.GroupedListSection {
    def this(props: IGroupedListSectionProps) = this()
  }
}
