package typingsSlinky.ejWebAll.ej.TreeGrid

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
  /** Returns the previous selected data.
    */
  var previousData: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row index.
    */
  var previousIndex: js.UndefOr[String] = js.native
  /** Returns the previous selected row element.
    */
  var previousTreeGridRow: js.UndefOr[js.Any] = js.native
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[String] = js.native
  /** Returns the selecting row element.
    */
  var targetRow: js.UndefOr[js.Any] = js.native
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
    def withPreviousTreeGridRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTreeGridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousTreeGridRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTreeGridRow")(js.undefined)
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
    def withTargetRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRow")(js.undefined)
        ret
    }
  }
  
}

