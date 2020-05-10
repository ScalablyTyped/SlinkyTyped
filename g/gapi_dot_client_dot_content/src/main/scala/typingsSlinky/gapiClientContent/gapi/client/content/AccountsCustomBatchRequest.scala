package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCustomBatchRequest extends js.Object {
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[AccountsCustomBatchRequestEntry]] = js.native
}

object AccountsCustomBatchRequest {
  @scala.inline
  def apply(): AccountsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsCustomBatchRequest]
  }
  @scala.inline
  implicit class AccountsCustomBatchRequestOps[Self <: AccountsCustomBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[AccountsCustomBatchRequestEntry]): Self = {
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
  }
  
}

