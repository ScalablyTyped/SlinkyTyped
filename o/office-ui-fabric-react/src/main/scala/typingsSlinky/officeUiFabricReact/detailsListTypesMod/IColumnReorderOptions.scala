package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnReorderOptions extends js.Object {
  /**
    * Specifies the number fixed columns from right
    * @defaultvalue 0
    */
  var frozenColumnCountFromEnd: js.UndefOr[Double] = js.native
  /**
    * Specifies the number fixed columns from left(0th index)
    * @defaultvalue 0
    */
  var frozenColumnCountFromStart: js.UndefOr[Double] = js.native
  /**
    * Callback to handle the column reorder
    * draggedIndex is the source column index, that need to be placed in targetIndex
    * Deprecated, use `onColumnDrop` instead.
    * @deprecated Use `onColumnDrop` instead.
    */
  var handleColumnReorder: js.UndefOr[js.Function2[/* draggedIndex */ Double, /* targetIndex */ Double, Unit]] = js.native
  /**
    * Callback to handle the column dragstart
    * draggedStarted indicates that the column drag has been started on DetailsHeader
    */
  var onColumnDragStart: js.UndefOr[js.Function1[/* dragStarted */ Boolean, Unit]] = js.native
  /**
    * Callback to handle the column reorder
    * draggedIndex is the source column index, that need to be placed in targetIndex
    */
  var onColumnDrop: js.UndefOr[js.Function1[/* dragDropDetails */ IColumnDragDropDetails, Unit]] = js.native
  /**
    * Callback to handle the column reorder
    */
  var onDragEnd: js.UndefOr[js.Function1[/* columnDropLocationDetails */ ColumnDragEndLocation, Unit]] = js.native
}

object IColumnReorderOptions {
  @scala.inline
  def apply(): IColumnReorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnReorderOptions]
  }
  @scala.inline
  implicit class IColumnReorderOptionsOps[Self <: IColumnReorderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrozenColumnCountFromEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCountFromEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenColumnCountFromEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCountFromEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenColumnCountFromStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCountFromStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenColumnCountFromStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCountFromStart")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleColumnReorder(value: (/* draggedIndex */ Double, /* targetIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColumnReorder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleColumnReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColumnReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnDragStart(value: /* dragStarted */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnDrop(value: /* dragDropDetails */ IColumnDragDropDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* columnDropLocationDetails */ ColumnDragEndLocation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
  }
  
}

