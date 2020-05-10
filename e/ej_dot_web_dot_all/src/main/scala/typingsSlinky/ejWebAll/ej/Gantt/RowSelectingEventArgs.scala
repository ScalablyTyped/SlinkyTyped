package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the data selecting record.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row chart element.
    */
  var previousChartRow: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected data.
    */
  var previousData: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row grid element.
    */
  var previousGridRow: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row index.
    */
  var previousIndex: js.UndefOr[String] = js.native
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[String] = js.native
  /** Returns the selecting row chart element.
    */
  var targetChartRow: js.UndefOr[js.Any] = js.native
  /** Returns the selecting row grid element.
    */
  var targetGridRow: js.UndefOr[js.Any] = js.native
}

object RowSelectingEventArgs {
  @scala.inline
  def apply(): RowSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
  @scala.inline
  implicit class RowSelectingEventArgsOps[Self <: RowSelectingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousChartRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousChartRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousChartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousChartRow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousData")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousGridRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousGridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousGridRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousGridRow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetChartRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetChartRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetChartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetChartRow")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGridRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGridRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGridRow")(js.undefined)
        ret
    }
  }
  
}

