package typingsSlinky.lovefield.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionStats extends js.Object {
  def changedTableCount(): Double = js.native
  def deletedRowCount(): Double = js.native
  def insertedRowCount(): Double = js.native
  def success(): Boolean = js.native
  def updatedRowCount(): Double = js.native
}

object TransactionStats {
  @scala.inline
  def apply(
    changedTableCount: () => Double,
    deletedRowCount: () => Double,
    insertedRowCount: () => Double,
    success: () => Boolean,
    updatedRowCount: () => Double
  ): TransactionStats = {
    val __obj = js.Dynamic.literal(changedTableCount = js.Any.fromFunction0(changedTableCount), deletedRowCount = js.Any.fromFunction0(deletedRowCount), insertedRowCount = js.Any.fromFunction0(insertedRowCount), success = js.Any.fromFunction0(success), updatedRowCount = js.Any.fromFunction0(updatedRowCount))
    __obj.asInstanceOf[TransactionStats]
  }
  @scala.inline
  implicit class TransactionStatsOps[Self <: TransactionStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedTableCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedTableCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeletedRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedRowCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertedRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedRowCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSuccess(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdatedRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRowCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

