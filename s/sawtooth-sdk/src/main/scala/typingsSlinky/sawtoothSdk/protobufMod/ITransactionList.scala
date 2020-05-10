package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransactionList extends js.Object {
  /** TransactionList transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}

object ITransactionList {
  @scala.inline
  def apply(): ITransactionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionList]
  }
  @scala.inline
  implicit class ITransactionListOps[Self <: ITransactionList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactions(value: js.Array[ITransaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(null)
        ret
    }
  }
  
}

