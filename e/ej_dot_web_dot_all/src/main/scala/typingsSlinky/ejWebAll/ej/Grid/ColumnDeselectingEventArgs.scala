package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDeselectingEventArgs extends js.Object {
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.native
  /** Returns the deselecting column index value.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /** Returns the deselecting column header element.
    */
  var headerCell: js.UndefOr[js.Any] = js.native
  /** Returns whether the ctrl key is pressed while deselecting column
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns whether the shift key is pressed while deselecting column
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ColumnDeselectingEventArgs {
  @scala.inline
  def apply(): ColumnDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDeselectingEventArgs]
  }
  @scala.inline
  implicit class ColumnDeselectingEventArgsOps[Self <: ColumnDeselectingEventArgs] (val x: Self) extends AnyVal {
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

