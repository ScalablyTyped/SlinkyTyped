package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSelectionEventArgs extends js.Object {
  /** returns the JSON records of the selected range of cells.
    */
  var JSONRecords: js.UndefOr[js.Any] = js.native
  /** Returns the column headers corresponding to the selected value cells.
    */
  var columnheader: js.UndefOr[js.Any] = js.native
  /** Returns the information about the measure associated with the selected cell.
    */
  var measureCount: js.UndefOr[String] = js.native
  /** Returns the row headers corresponding to the selected value cells.
    */
  var rowheader: js.UndefOr[js.Any] = js.native
}

object CellSelectionEventArgs {
  @scala.inline
  def apply(): CellSelectionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionEventArgs]
  }
  @scala.inline
  implicit class CellSelectionEventArgsOps[Self <: CellSelectionEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSONRecords(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSONRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSONRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSONRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnheader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnheader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnheader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnheader")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRowheader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowheader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowheader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowheader")(js.undefined)
        ret
    }
  }
  
}

