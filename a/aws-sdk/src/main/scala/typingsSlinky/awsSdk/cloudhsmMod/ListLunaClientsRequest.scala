package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLunaClientsRequest extends js.Object {
  /**
    * The NextToken value from a previous call to ListLunaClients. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListLunaClientsRequest {
  @scala.inline
  def apply(): ListLunaClientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLunaClientsRequest]
  }
  @scala.inline
  implicit class ListLunaClientsRequestOps[Self <: ListLunaClientsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

