package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSelectingEventArgs extends js.Object {
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.native
  /** Returns the selected column index value.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /** Returns the selected header cell element.
    */
  var headerCell: js.UndefOr[js.Any] = js.native
  /** Returns whether the ctrl key is pressed while selecting cell
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns whether the shift key is pressed while selecting cell
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected header cell element.
    */
  var prevColumnHeaderCell: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected column index value.
    */
  var previousColumnIndex: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ColumnSelectingEventArgs {
  @scala.inline
  def apply(): ColumnSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSelectingEventArgs]
  }
  @scala.inline
  implicit class ColumnSelectingEventArgsOps[Self <: ColumnSelectingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCell(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCell")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCtrlKeyPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCtrlKeyPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCtrlKeyPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCtrlKeyPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsShiftKeyPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShiftKeyPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsShiftKeyPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShiftKeyPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevColumnHeaderCell(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevColumnHeaderCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevColumnHeaderCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevColumnHeaderCell")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

