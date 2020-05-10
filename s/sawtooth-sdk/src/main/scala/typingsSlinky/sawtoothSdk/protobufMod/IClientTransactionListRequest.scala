package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientTransactionListRequest extends js.Object {
  /** ClientTransactionListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  /** ClientTransactionListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  /** ClientTransactionListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
  /** ClientTransactionListRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}

object IClientTransactionListRequest {
  @scala.inline
  def apply(): IClientTransactionListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListRequest]
  }
  @scala.inline
  implicit class IClientTransactionListRequestOps[Self <: IClientTransactionListRequest] (val x: Self) extends AnyVal {
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
    def withPaging(value: IClientPagingControls): Self = {
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
    def withSorting(value: js.Array[IClientSortControls]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(null)
        ret
    }
    @scala.inline
    def withTransactionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(null)
        ret
    }
  }
  
}

