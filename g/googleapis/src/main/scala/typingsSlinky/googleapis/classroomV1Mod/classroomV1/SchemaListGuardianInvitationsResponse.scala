package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing guardian invitations.
  */
@js.native
trait SchemaListGuardianInvitationsResponse extends js.Object {
  /**
    * Guardian invitations that matched the list request.
    */
  var guardianInvitations: js.UndefOr[js.Array[SchemaGuardianInvitation]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListGuardianInvitationsResponse {
  @scala.inline
  def apply(): SchemaListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuardianInvitationsResponse]
  }
  @scala.inline
  implicit class SchemaListGuardianInvitationsResponseOps[Self <: SchemaListGuardianInvitationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuardianInvitations(value: js.Array[SchemaGuardianInvitation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardianInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardianInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardianInvitations")(js.undefined)
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

