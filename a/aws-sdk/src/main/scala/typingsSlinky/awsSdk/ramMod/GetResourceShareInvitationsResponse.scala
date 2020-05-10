package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareInvitationsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Information about the invitations.
    */
  var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.native
}

object GetResourceShareInvitationsResponse {
  @scala.inline
  def apply(): GetResourceShareInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareInvitationsResponse]
  }
  @scala.inline
  implicit class GetResourceShareInvitationsResponseOps[Self <: GetResourceShareInvitationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareInvitations(value: ResourceShareInvitationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareInvitations")(js.undefined)
        ret
    }
  }
  
}

