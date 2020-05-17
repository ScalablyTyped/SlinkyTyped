package typingsSlinky.blueprintjsTable.anon

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.selectableMod.ISelectedRegionTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/selectable.IDragSelectableProps> */
@js.native
trait PartialIDragSelectablePro extends js.Object {
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
  var enableMultipleSelection: js.UndefOr[Boolean] = js.native
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  var ignoredSelectors: js.UndefOr[js.Array[String]] = js.native
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.native
  var locateDrag: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ ICoordinateData, 
      /* returnEndOnly */ js.UndefOr[Boolean], 
      IRegion
    ]
  ] = js.native
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.native
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.native
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
}

object PartialIDragSelectablePro {
  @scala.inline
  def apply(): PartialIDragSelectablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragSelectablePro]
  }
  @scala.inline
  implicit class PartialIDragSelectableProOps[Self <: PartialIDragSelectablePro] (val x: Self) extends AnyVal {
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
    def withEnableMultipleSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultipleSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedCell(value: IFocusedCellCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCell")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredSelectors")(js.undefined)
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
    def withLocateDrag(
      value: (/* event */ MouseEvent, /* coords */ ICoordinateData, /* returnEndOnly */ js.UndefOr[Boolean]) => IRegion
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateDrag")(js.Any.fromFunction3(value))
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
    def withOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelectedRegionTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionTransform")(js.undefined)
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
  }
  
}

