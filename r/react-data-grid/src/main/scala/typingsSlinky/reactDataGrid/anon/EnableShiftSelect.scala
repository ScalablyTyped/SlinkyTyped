package typingsSlinky.reactDataGrid.anon

import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.SelectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableShiftSelect[T] extends js.Object {
  var enableShiftSelect: js.UndefOr[Boolean] = js.native
  var onRowsDeselected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.native
  var onRowsSelected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.native
  var selectBy: js.UndefOr[Indexes] = js.native
  var showCheckbox: js.UndefOr[Boolean] = js.native
}

object EnableShiftSelect {
  @scala.inline
  def apply[T](): EnableShiftSelect[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableShiftSelect[T]]
  }
  @scala.inline
  implicit class EnableShiftSelectOps[Self[t] <: EnableShiftSelect[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEnableShiftSelect(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableShiftSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableShiftSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableShiftSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowsDeselected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsDeselected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowsDeselected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsDeselected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowsSelected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowsSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectBy(value: Indexes): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectBy")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckbox(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckbox: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(js.undefined)
        ret
    }
  }
  
}

