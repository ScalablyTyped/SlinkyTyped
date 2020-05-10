package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientStateListResponse extends js.Object {
  /** ClientStateListResponse entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.native
  /** ClientStateListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.native
  /** ClientStateListResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.native
  /** ClientStateListResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientStateListResponse {
  @scala.inline
  def apply(): IClientStateListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateListResponse]
  }
  @scala.inline
  implicit class IClientStateListResponseOps[Self <: IClientStateListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[IEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withEntriesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(null)
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
  }
  
}

