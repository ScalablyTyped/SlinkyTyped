package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.ItemIndex
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyleProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyles
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsColumn {
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsColumn", "DetailsColumn")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] {
    @scala.inline
    def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: () => Unit): this.type = set("componentRef", js.Any.fromFunction0(value))
    @scala.inline
    def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    @scala.inline
    def dragDropHelperNull: this.type = set("dragDropHelper", null)
    @scala.inline
    def isDraggable(value: Boolean): this.type = set("isDraggable", value.asInstanceOf[js.Any])
    @scala.inline
    def isDropped(value: Boolean): this.type = set("isDropped", value.asInstanceOf[js.Any])
    @scala.inline
    def onColumnClick(value: (/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn) => Unit): this.type = set("onColumnClick", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnContextMenu(value: (/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onColumnContextMenu", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): this.type = set("onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
    @scala.inline
    def parentId(value: String): this.type = set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraggedItemIndex(value: /* itemIndex */ Double => Unit): this.type = set("setDraggedItemIndex", js.Any.fromFunction1(value))
    @scala.inline
    def stylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def updateDragInfo(value: (/* props */ ItemIndex, /* event */ js.UndefOr[MouseEvent]) => Unit): this.type = set("updateDragInfo", js.Any.fromFunction2(value))
    @scala.inline
    def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(column: IColumn, columnIndex: Double): Builder = {
    val __props = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsColumnProps]))
  }
}

