package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.AnonColIndex
import typingsSlinky.reactBootstrapTable.reactBootstrapTableNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellEdit[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * Accept a custom callback function, after cell saving, this function will be called.
  	 * This callback function takes three arguments: row, cellName and cellValue
  	 *   `row`: the row data that was saved.
  	 *   `cellName`: the column dataField cell name that has been modified.
  	 *   `cellValue`: the new cell value.
  	 *   `props`: an object containing the current cell's rowIndex and colIndex values.
  	 */
  var afterSaveCell: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* keyof TRow */ /* cellName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* props */ AnonColIndex, 
      Unit
    ]
  ] = js.native
  /**
  	 * Accept a custom callback function, before cell saving, this function will be called.
  	 * This callback function takes four arguments: row, cellName, cellValue and done.
  	 *   `row`: the row data to be saved.
  	 *   `cellName`: the column dataField cell name that has been modified.
  	 *   `cellValue`: the new cell value.
  	 *   `done`: a callback function to use if this is an async operation, to indicate if the save data is valid.
  	 *   `props`: an object containing the current cell's rowIndex and colIndex values.
  	 * If your validation is async, for example: you want to pop a confirm dialog for user to confim in this case,
  	 * react-bootstrap-table pass a callback function to you. You are supposed to call this callback function with a
  	 * bool value to perfom if it is valid or not in addition, you should return 1 from the main function to tell
  	 * react-bootstrap-table that this is a async operation.
  	 */
  var beforeSaveCell: js.UndefOr[
    js.Function5[
      /* row */ TRow, 
      /* keyof TRow */ /* cellName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* done */ js.Function1[/* isValid */ Boolean, Unit], 
      /* props */ AnonColIndex, 
      Boolean | `1`
    ]
  ] = js.native
  /**
  	 * Enabling blurToEscape will result in a cell edit being cancelled when the user clicks outside the table during
  	 * editing.
  	 * Default is false.
  	 */
  var blurToEscape: js.UndefOr[Boolean] = js.native
  /**
  	 * Enabling blurToSave will trigger a saving event on the cell when the input field becomes deselected. Default is false.
  	 * In the default condition, you need to press ENTER to save the cell.
  	 */
  var blurToSave: js.UndefOr[Boolean] = js.native
  /**
  	 * Spectify which condition will trigger cell editing.(click or dbclick). Required.
  	 */
  var mode: CellEditClickMode = js.native
  /**
  	 * nonEditableRows tell react-bootstrap-table which rows should not be edited on all of the columns. Briefly, its a row level limitation
  	 * Please assign a callback function, and this function is supposed to be return an array of row keys.
  	 */
  var nonEditableRows: js.UndefOr[js.Function0[js.Array[Double | String]]] = js.native
}

object CellEdit {
  @scala.inline
  def apply[TRow](mode: CellEditClickMode): CellEdit[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEdit[TRow]]
  }
  @scala.inline
  implicit class CellEditOps[Self[trow] <: CellEdit[trow], TRow] (val x: Self[TRow]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TRow] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TRow] with Other]
    @scala.inline
    def withMode(value: CellEditClickMode): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSaveCell(
      value: (/* row */ TRow, /* keyof TRow */ /* cellName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, /* props */ AnonColIndex) => Unit
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSaveCell")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterSaveCell: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSaveCell")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSaveCell(
      value: (/* row */ TRow, /* keyof TRow */ /* cellName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, /* done */ js.Function1[/* isValid */ Boolean, Unit], /* props */ AnonColIndex) => Boolean | `1`
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSaveCell")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutBeforeSaveCell: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSaveCell")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurToEscape(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurToEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurToEscape: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurToEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurToSave(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurToSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurToSave: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurToSave")(js.undefined)
        ret
    }
    @scala.inline
    def withNonEditableRows(value: () => js.Array[Double | String]): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEditableRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNonEditableRows: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEditableRows")(js.undefined)
        ret
    }
  }
  
}

