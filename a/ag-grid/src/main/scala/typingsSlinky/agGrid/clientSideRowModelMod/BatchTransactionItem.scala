package typingsSlinky.agGrid.clientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchTransactionItem extends js.Object {
  var rowDataTransaction: RowDataTransaction = js.native
  def callback(res: RowNodeTransaction): Unit = js.native
}

object BatchTransactionItem {
  @scala.inline
  def apply(callback: RowNodeTransaction => Unit, rowDataTransaction: RowDataTransaction): BatchTransactionItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), rowDataTransaction = rowDataTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchTransactionItem]
  }
  @scala.inline
  implicit class BatchTransactionItemOps[Self <: BatchTransactionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: RowNodeTransaction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowDataTransaction(value: RowDataTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataTransaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

