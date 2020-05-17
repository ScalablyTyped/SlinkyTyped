package typingsSlinky.blueprintjsTable.anon

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/reorderable.IDragReorderable> */
@js.native
trait PartialIDragReorderable extends js.Object {
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.native
  var locateDrag: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Double]] = js.native
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.native
  var onReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  var onReordering: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  var toRegion: js.UndefOr[js.Function2[/* index1 */ Double, /* index2 */ js.UndefOr[Double], IRegion]] = js.native
}

object PartialIDragReorderable {
  @scala.inline
  def apply(): PartialIDragReorderable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragReorderable]
  }
  @scala.inline
  implicit class PartialIDragReorderableOps[Self <: PartialIDragReorderable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLocateClick(value: /* event */ MouseEvent => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLocateClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateClick")(js.undefined)
        ret
    }
    @scala.inline
    def withLocateDrag(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLocateDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCell")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReordered")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnReordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReordered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReordering(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReordering")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelection(value: /* regions */ js.Array[IRegion] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRegions(value: js.Array[IRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withToRegion(value: (/* index1 */ Double, /* index2 */ js.UndefOr[Double]) => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRegion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRegion")(js.undefined)
        ret
    }
  }
  
}

