package typingsSlinky.officeUiFabricReact.detailsColumnTypesMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.AnonItemIndex
import typingsSlinky.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsColumnProps extends ClassAttributes[DetailsColumnBase] {
  /**
    * Custom styles for cell rendering.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  /**
    * The column definition for the component instance.
    */
  var column: IColumn = js.native
  /**
    * The column index for the component instance.
    */
  var columnIndex: Double = js.native
  /**
    * A reference to the component instance.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The drag and drop helper for the component instance.
    */
  var dragDropHelper: js.UndefOr[IDragDropHelper | Null] = js.native
  /**
    * Whether or not the column can be re-ordered via drag and drop.
    */
  var isDraggable: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the column has been dropped via drag and drop.
    */
  var isDropped: js.UndefOr[Boolean] = js.native
  /**
    * Callback fired when click event occurs.
    */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn, Unit]
  ] = js.native
  /**
    * Callback fired on contextual menu event to provide contextual menu UI.
    */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  /**
    * Render function for providing a column header tooltip.
    */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.native
  /**
    * Parent ID used for accessibility label(s).
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * @deprecated use `updateDragInfo`
    */
  var setDraggedItemIndex: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.native
  /**
    * The component styles to respect during render.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.native
  /**
    * The theme object to respect during render.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Callback on drag and drop event.
    */
  var updateDragInfo: js.UndefOr[
    js.Function2[/* props */ AnonItemIndex, /* event */ js.UndefOr[MouseEvent], Unit]
  ] = js.native
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
}

object IDetailsColumnProps {
  @scala.inline
  def apply(column: IColumn, columnIndex: Double): IDetailsColumnProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnProps]
  }
  @scala.inline
  implicit class IDetailsColumnPropsOps[Self <: IDetailsColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: IColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellStyleProps(value: ICellStyleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDropHelper(value: IDragDropHelper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDropHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropHelper")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDropHelperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropHelper")(null)
        ret
    }
    @scala.inline
    def withIsDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDropped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnClick(value: (/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnContextMenu(value: (/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderColumnHeaderTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderColumnHeaderTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDraggedItemIndex(value: /* itemIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDraggedItemIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDraggedItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDraggedItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDetailsColumnStyleProps => Partial[IDetailsColumnStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDragInfo(value: (/* props */ AnonItemIndex, /* event */ js.UndefOr[MouseEvent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDragInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateDragInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDragInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFastIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFastIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFastIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFastIcons")(js.undefined)
        ret
    }
  }
  
}

