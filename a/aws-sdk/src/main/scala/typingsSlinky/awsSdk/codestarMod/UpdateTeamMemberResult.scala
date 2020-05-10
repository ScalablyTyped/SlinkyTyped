package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTeamMemberResult extends js.Object {
  /**
    * The project role granted to the user.
    */
  var projectRole: js.UndefOr[Role] = js.native
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
    */
  var userArn: js.UndefOr[UserArn] = js.native
}

object UpdateTeamMemberResult {
  @scala.inline
  def apply(): UpdateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTeamMemberResult]
  }
  @scala.inline
  implicit class UpdateTeamMemberResultOps[Self <: UpdateTeamMemberResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectRole")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAccessAllowed(value: RemoteAccessAllowed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAccessAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withUserArn(value: UserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(js.undefined)
        ret
    }
  }
  
}

