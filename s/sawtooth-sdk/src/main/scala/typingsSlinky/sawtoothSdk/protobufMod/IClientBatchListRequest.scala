package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBatchListRequest extends js.Object {
  /** ClientBatchListRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** ClientBatchListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  /** ClientBatchListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  /** ClientBatchListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
}

object IClientBatchListRequest {
  @scala.inline
  def apply(): IClientBatchListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchListRequest]
  }
  @scala.inline
  implicit class IClientBatchListRequestOps[Self <: IClientBatchListRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(null)
        ret
    }
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
  }
  
}

