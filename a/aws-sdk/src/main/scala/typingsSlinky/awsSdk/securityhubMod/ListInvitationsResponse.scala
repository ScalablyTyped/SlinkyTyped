package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvitationsResponse extends js.Object {
  /**
    * The details of the invitations returned by the operation.
    */
  var Invitations: js.UndefOr[InvitationList] = js.native
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListInvitationsResponse {
  @scala.inline
  def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  @scala.inline
  implicit class ListInvitationsResponseOps[Self <: ListInvitationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitations(value: InvitationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invitations")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NonEmptyString): Self = {
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

