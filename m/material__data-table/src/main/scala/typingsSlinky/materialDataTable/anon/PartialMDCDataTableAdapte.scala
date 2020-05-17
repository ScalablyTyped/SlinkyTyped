package typingsSlinky.materialDataTable.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/data-table.@material/data-table/adapter.MDCDataTableAdapter> */
@js.native
trait PartialMDCDataTableAdapte extends js.Object {
  var addClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.native
  var getRowCount: js.UndefOr[js.Function0[Double]] = js.native
  var getRowElements: js.UndefOr[js.Function0[js.Array[Element]]] = js.native
  var getRowIdAtIndex: js.UndefOr[js.Function1[/* rowIndex */ Double, String | Null]] = js.native
  var getRowIndexByChildElement: js.UndefOr[js.Function1[/* el */ Element, Double]] = js.native
  var getSelectedRowCount: js.UndefOr[js.Function0[Double]] = js.native
  var isCheckboxAtRowIndexChecked: js.UndefOr[js.Function1[/* rowIndex */ Double, Boolean]] = js.native
  var isHeaderRowCheckboxChecked: js.UndefOr[js.Function0[Boolean]] = js.native
  var isRowsSelectable: js.UndefOr[js.Function0[Boolean]] = js.native
  var notifyRowSelectionChanged: js.UndefOr[js.Function1[/* data */ MDCDataTableRowSelectionChangedEventDetail, Unit]] = js.native
  var notifySelectedAll: js.UndefOr[js.Function0[Unit]] = js.native
  var notifyUnselectedAll: js.UndefOr[js.Function0[Unit]] = js.native
  var registerHeaderRowCheckbox: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  var registerRowCheckboxes: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  var removeClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.native
  var setAttributeAtRowIndex: js.UndefOr[js.Function3[/* rowIndex */ Double, /* attr */ String, /* value */ String, Unit]] = js.native
  var setHeaderRowCheckboxChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  var setHeaderRowCheckboxIndeterminate: js.UndefOr[js.Function1[/* indeterminate */ Boolean, Unit]] = js.native
  var setRowCheckboxCheckedAtIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* checked */ Boolean, Unit]] = js.native
}

object PartialMDCDataTableAdapte {
  @scala.inline
  def apply(): PartialMDCDataTableAdapte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCDataTableAdapte]
  }
  @scala.inline
  implicit class PartialMDCDataTableAdapteOps[Self <: PartialMDCDataTableAdapte] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClassAtRowIndex(value: (/* rowIndex */ Double, /* cssClasses */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassAtRowIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddClassAtRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassAtRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowElements(value: () => js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowElements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRowElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowElements")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowIdAtIndex(value: /* rowIndex */ Double => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIdAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowIdAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIdAtIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowIndexByChildElement(value: /* el */ Element => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIndexByChildElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowIndexByChildElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIndexByChildElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRowCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectedRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCheckboxAtRowIndexChecked(value: /* rowIndex */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCheckboxAtRowIndexChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsCheckboxAtRowIndexChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCheckboxAtRowIndexChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeaderRowCheckboxChecked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderRowCheckboxChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsHeaderRowCheckboxChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderRowCheckboxChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowsSelectable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowsSelectable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsRowsSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowsSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyRowSelectionChanged(value: /* data */ MDCDataTableRowSelectionChangedEventDetail => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyRowSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifyRowSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyRowSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifySelectedAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySelectedAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotifySelectedAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySelectedAll")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyUnselectedAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyUnselectedAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotifyUnselectedAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyUnselectedAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterHeaderRowCheckbox(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHeaderRowCheckbox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRegisterHeaderRowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHeaderRowCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterRowCheckboxes(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerRowCheckboxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRegisterRowCheckboxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerRowCheckboxes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClassAtRowIndex(value: (/* rowIndex */ Double, /* cssClasses */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClassAtRowIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveClassAtRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClassAtRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributeAtRowIndex(value: (/* rowIndex */ Double, /* attr */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeAtRowIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetAttributeAtRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeAtRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeaderRowCheckboxChecked(value: /* checked */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderRowCheckboxChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeaderRowCheckboxChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderRowCheckboxChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeaderRowCheckboxIndeterminate(value: /* indeterminate */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderRowCheckboxIndeterminate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeaderRowCheckboxIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderRowCheckboxIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRowCheckboxCheckedAtIndex(value: (/* rowIndex */ Double, /* checked */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowCheckboxCheckedAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetRowCheckboxCheckedAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowCheckboxCheckedAtIndex")(js.undefined)
        ret
    }
  }
  
}

