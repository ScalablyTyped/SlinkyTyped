package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Compact
import typingsSlinky.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsSlinky.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typingsSlinky.officeUiFabricReact.groupedListBaseMod.IGroupedListState
import typingsSlinky.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGroupedListMod {
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
    
    /* 0 */ val hidden: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    
    /* 1 */ val visible: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupFooter")
  @js.native
  val GroupFooter: ReactComponentClass[IGroupFooterProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupHeader")
  @js.native
  val GroupHeader: ReactComponentClass[IGroupHeaderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupShowAll")
  @js.native
  val GroupShowAll: ReactComponentClass[IGroupShowAllProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupSpacer")
  @js.native
  val GroupSpacer: ReactComponentClass[IGroupSpacerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedList")
  @js.native
  val GroupedList: ReactComponentClass[IGroupedListProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase")
  @js.native
  class GroupedListBase protected ()
    extends typingsSlinky.officeUiFabricReact.groupedListMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  /* static members */
  object GroupedListBase {
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase.defaultProps")
    @js.native
    def defaultProps: Compact = js.native
    @scala.inline
    def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListSection")
  @js.native
  class GroupedListSection protected ()
    extends typingsSlinky.officeUiFabricReact.groupedListMod.GroupedListSection {
    def this(props: IGroupedListSectionProps) = this()
  }
}
