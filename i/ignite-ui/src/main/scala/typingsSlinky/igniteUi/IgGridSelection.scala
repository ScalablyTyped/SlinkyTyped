package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSelection
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables / disables activation of rows and cells. Activation implies ability to perform navigating through cells and rows via the keyboard, and selecting rows and cells using CTRL / SHIFT - in the way cells/rows are selected in Ms Excel
  	 *
  	 */
  var activation: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after a cell becomes active (focus style applied).
  	 */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.native
  /**
  	 * Event fired before a cell becomes active (focus style applied) (cancellable).
  	 * Return false in order to cancel active cell changing.
  	 */
  var activeCellChanging: js.UndefOr[ActiveCellChangingEvent] = js.native
  /**
  	 * Event fired after a row becomes active (focus style applied).
  	 */
  var activeRowChanged: js.UndefOr[ActiveRowChangedEvent] = js.native
  /**
  	 * Event fired before a row becomes active (focus style applied) (cancellable).
  	 * Return false in order to cancel active row changing.
  	 */
  var activeRowChanging: js.UndefOr[ActiveRowChangingEvent] = js.native
  /**
  	 * Enables / disables the ability to ctrl drag multiple selection windows when selection mode is 'cell'
  	 *
  	 */
  var allowMultipleRangeSelection: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after cell(s) are selected.
  	 */
  var cellSelectionChanged: js.UndefOr[CellSelectionChangedEvent] = js.native
  /**
  	 * Event fired before cell(s) are about to be selected (cancellable).
  	 * Return false in order to cancel cell selection changing.
  	 */
  var cellSelectionChanging: js.UndefOr[CellSelectionChangingEvent] = js.native
  /**
  	 * Defines type of the selection.
  	 *
  	 *
  	 * Valid values:
  	 * "row" Defines row selection mode.
  	 * "cell" Defines cell selection mode.
  	 */
  var mode: js.UndefOr[String] = js.native
  /**
  	 * Enables / disables selection via dragging with the mouse - only applicable for cell selection
  	 *
  	 */
  var mouseDragSelect: js.UndefOr[Boolean] = js.native
  /**
  	 * If true multiple selection of cells is done as if CTRL is being held. the option is disregarded if mode is set to row. this option is useful for enabling multiple discountinued selection on touch environments.
  	 *
  	 */
  var multipleCellSelectOnClick: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables / Disables multiple selection of cells and rows - depending on the mode
  	 *
  	 */
  var multipleSelection: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables / disables selection persistance between states.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after row(s) are selected.
  	 */
  var rowSelectionChanged: js.UndefOr[RowSelectionChangedEvent] = js.native
  /**
  	 * Event fired before row(s) are about to be selected (cancellable).
  	 * Return false in order to cancel selection changing.
  	 */
  var rowSelectionChanging: js.UndefOr[RowSelectionChangingEvent] = js.native
  /**
  	 * If true will basically skip going into child grids with down / up / right / left arrow keys, when in the context of hierarchical grid
  	 *
  	 */
  var skipChildren: js.UndefOr[Boolean] = js.native
  /**
  	 * Deprecated="true" Enables / disables selection via continuous touch event - only applicable for cell selection and touch-supported environments
  	 *
  	 */
  var touchDragSelect: js.UndefOr[Boolean] = js.native
  /**
  	 * If wrapAround is enabled and selection is on the first or last row or cell, then when the end user tries to go beyond that, the first/last row or cell will be selected
  	 *
  	 */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object IgGridSelection {
  @scala.inline
  def apply(): IgGridSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSelection]
  }
  @scala.inline
  implicit class IgGridSelectionOps[Self <: IgGridSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveCellChanged(value: (/* event */ Event, /* ui */ ActiveCellChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCellChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActiveCellChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCellChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveCellChanging(value: (/* event */ Event, /* ui */ ActiveCellChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCellChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActiveCellChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCellChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveRowChanged(value: (/* event */ Event, /* ui */ ActiveRowChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRowChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActiveRowChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRowChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveRowChanging(value: (/* event */ Event, /* ui */ ActiveRowChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRowChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActiveRowChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRowChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultipleRangeSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleRangeSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleRangeSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleRangeSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelectionChanged(value: (/* event */ Event, /* ui */ CellSelectionChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelectionChanging(value: (/* event */ Event, /* ui */ CellSelectionChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelectionChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellSelectionChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelectionChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDragSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDragSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseDragSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDragSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleCellSelectOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleCellSelectOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleCellSelectOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleCellSelectOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelectionChanged(value: (/* event */ Event, /* ui */ RowSelectionChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelectionChanging(value: (/* event */ Event, /* ui */ RowSelectionChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowSelectionChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchDragSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDragSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchDragSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDragSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(js.undefined)
        ret
    }
  }
  
}

