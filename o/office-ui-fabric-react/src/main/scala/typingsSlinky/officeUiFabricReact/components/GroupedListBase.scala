package typingsSlinky.officeUiFabricReact.components

import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.Callback
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedList
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListStyleProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListStyles
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupedListBase {
  @JSImport("office-ui-fabric-react", "GroupedListBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.GroupedListBase] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IGroupedList | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IGroupedList]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IGroupedList]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    @scala.inline
    def eventsToRegister(value: js.Array[Callback]): this.type = set("eventsToRegister", value.asInstanceOf[js.Any])
    @scala.inline
    def getGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): this.type = set("getGroupHeight", js.Any.fromFunction2(value))
    @scala.inline
    def groupProps(value: IGroupRenderProps): this.type = set("groupProps", value.asInstanceOf[js.Any])
    @scala.inline
    def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def listProps(value: IListProps[_]): this.type = set("listProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onGroupExpandStateChanged(value: /* isSomeGroupExpanded */ Boolean => Unit): this.type = set("onGroupExpandStateChanged", js.Any.fromFunction1(value))
    @scala.inline
    def onShouldVirtualize(value: /* props */ IListProps[_] => Boolean): this.type = set("onShouldVirtualize", js.Any.fromFunction1(value))
    @scala.inline
    def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IGroupedListStyleProps => Partial[IGroupedListStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def usePageCache(value: Boolean): this.type = set("usePageCache", value.asInstanceOf[js.Any])
    @scala.inline
    def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGroupedListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    items: js.Array[_],
    onRenderCell: (js.UndefOr[Double], js.UndefOr[js.Any], js.UndefOr[Double]) => TagMod[Any]
  ): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRenderCell = js.Any.fromFunction3(onRenderCell))
    new Builder(js.Array(this.component, __props.asInstanceOf[IGroupedListProps]))
  }
}

