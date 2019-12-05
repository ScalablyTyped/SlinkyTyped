package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupFooterDotTypesMod.IGroupFooterProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupHeaderDotTypesMod.IGroupHeaderProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupShowAllDotTypesMod.IGroupShowAllProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupSpacerDotTypesMod.IGroupSpacerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/GroupedList", JSImport.Namespace)
@js.native
object libComponentsGroupedListMod extends js.Object {
  @js.native
  class GroupedListBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotBaseMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  
  val GroupFooter: ReactComponentClass[IGroupFooterProps] = js.native
  val GroupHeader: ReactComponentClass[IGroupHeaderProps] = js.native
  val GroupShowAll: ReactComponentClass[IGroupShowAllProps] = js.native
  val GroupSpacer: ReactComponentClass[IGroupSpacerProps] = js.native
  val GroupedList: ReactComponentClass[IGroupedListProps] = js.native
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object GroupedListBase extends js.Object {
    var defaultProps: Anon_Compact = js.native
  }
  
}

