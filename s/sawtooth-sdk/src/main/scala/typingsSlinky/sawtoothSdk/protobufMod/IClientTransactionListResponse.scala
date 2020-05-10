package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientTransactionListResponse extends js.Object {
  /** ClientTransactionListResponse headId */
  var headId: js.UndefOr[String | Null] = js.native
  /** ClientTransactionListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.native
  /** ClientTransactionListResponse status */
  var status: js.UndefOr[Status | Null] = js.native
  /** ClientTransactionListResponse transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}

object IClientTransactionListResponse {
  @scala.inline
  def apply(): IClientTransactionListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListResponse]
  }
  @scala.inline
  implicit class IClientTransactionListResponseOps[Self <: IClientTransactionListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headId")(null)
        ret
    }
    @scala.inline
    def withPaging(value: IClientPagingResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(null)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
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

