package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientStateListRequest extends js.Object {
  /** ClientStateListRequest address */
  var address: js.UndefOr[String | Null] = js.native
  /** ClientStateListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  /** ClientStateListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
  /** ClientStateListRequest stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.native
}

object IClientStateListRequest {
  @scala.inline
  def apply(): IClientStateListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateListRequest]
  }
  @scala.inline
  implicit class IClientStateListRequestOps[Self <: IClientStateListRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(null)
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
    def withStateRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withStateRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRoot")(null)
        ret
    }
  }
  
}

