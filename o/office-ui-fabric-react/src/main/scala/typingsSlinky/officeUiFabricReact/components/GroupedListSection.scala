package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.Callback
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsSlinky.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListStyles
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroupedListSection {
  
  @JSImport("office-ui-fabric-react", "GroupedListSection")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.GroupedListSection] {
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: () => Unit): this.type = set("componentRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventsToRegisterVarargs(value: Callback*): this.type = set("eventsToRegister", js.Array(value :_*))
    
    @scala.inline
    def eventsToRegister(value: js.Array[Callback]): this.type = set("eventsToRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerProps(value: IGroupFooterProps): this.type = set("footerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getGroupItemLimit(value: /* group */ IGroup => Double): this.type = set("getGroupItemLimit", js.Any.fromFunction1(value))
    
    @scala.inline
    def group(value: IGroup): this.type = set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupIndex(value: Double): this.type = set("groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupNestingDepth(value: Double): this.type = set("groupNestingDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupProps(value: IGroupRenderProps): this.type = set("groupProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupedListClassNames(value: IProcessedStyleSet[IGroupedListStyles]): this.type = set("groupedListClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupsVarargs(value: IGroup*): this.type = set("groups", js.Array(value :_*))
    
    @scala.inline
    def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerProps(value: IGroupHeaderProps): this.type = set("headerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listProps(value: IListProps[_]): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRenderGroupFooter(
      value: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupFooterProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderGroupFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRenderGroupHeader(
      value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderGroupHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRenderGroupShowAll(
      value: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderGroupShowAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def onShouldVirtualize(value: /* props */ IListProps[_] => Boolean): this.type = set("onShouldVirtualize", js.Any.fromFunction1(value))
    
    @scala.inline
    def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showAllProps(value: IGroupShowAllProps): this.type = set("showAllProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGroupedListSectionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    items: js.Array[_],
    onRenderCell: (js.UndefOr[Double], js.UndefOr[js.Any], js.UndefOr[Double]) => ReactElement
  ): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRenderCell = js.Any.fromFunction3(onRenderCell))
    new Builder(js.Array(this.component, __props.asInstanceOf[IGroupedListSectionProps]))
  }
}
