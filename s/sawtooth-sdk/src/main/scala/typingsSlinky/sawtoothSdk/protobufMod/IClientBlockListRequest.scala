package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBlockListRequest extends js.Object {
  /** ClientBlockListRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** ClientBlockListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  /** ClientBlockListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  /** ClientBlockListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
}

object IClientBlockListRequest {
  @scala.inline
  def apply(): IClientBlockListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockListRequest]
  }
  @scala.inline
  implicit class IClientBlockListRequestOps[Self <: IClientBlockListRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(null)
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

