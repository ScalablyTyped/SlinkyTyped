package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListClientUserInvitationsResponse extends js.Object {
  /**
    * The returned list of client users.
    */
  var invitations: js.UndefOr[js.Array[SchemaClientUserInvitation]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientUserInvitationsRequest.pageToken field in the subsequent call
    * to the clients.invitations.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListClientUserInvitationsResponse {
  @scala.inline
  def apply(): SchemaListClientUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientUserInvitationsResponse]
  }
  @scala.inline
  implicit class SchemaListClientUserInvitationsResponseOps[Self <: SchemaListClientUserInvitationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitations(value: js.Array[SchemaClientUserInvitation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitations")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

