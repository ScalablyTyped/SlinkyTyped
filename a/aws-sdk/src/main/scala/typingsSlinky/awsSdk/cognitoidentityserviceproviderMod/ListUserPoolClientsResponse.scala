package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPoolClientsResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
  /**
    * The user pool clients in the response that lists user pool clients.
    */
  var UserPoolClients: js.UndefOr[UserPoolClientListType] = js.native
}

object ListUserPoolClientsResponse {
  @scala.inline
  def apply(): ListUserPoolClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPoolClientsResponse]
  }
  @scala.inline
  implicit class ListUserPoolClientsResponseOps[Self <: ListUserPoolClientsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationKey): Self = {
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
    @scala.inline
    def withUserPoolClients(value: UserPoolClientListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolClients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolClients")(js.undefined)
        ret
    }
  }
  
}

