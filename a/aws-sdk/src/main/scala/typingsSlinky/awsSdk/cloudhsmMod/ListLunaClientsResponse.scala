package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLunaClientsResponse extends js.Object {
  /**
    * The list of clients.
    */
  var ClientList: typingsSlinky.awsSdk.cloudhsmMod.ClientList = js.native
  /**
    * If not null, more results are available. Pass this to ListLunaClients to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListLunaClientsResponse {
  @scala.inline
  def apply(ClientList: ClientList): ListLunaClientsResponse = {
    val __obj = js.Dynamic.literal(ClientList = ClientList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLunaClientsResponse]
  }
  @scala.inline
  implicit class ListLunaClientsResponseOps[Self <: ListLunaClientsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientList(value: ClientList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientList")(value.asInstanceOf[js.Any])
        ret
    }
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

