package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamMember extends js.Object {
  /**
    * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide. 
    */
  var projectRole: Role = js.native
  /**
    * Whether the user is allowed to remotely access project resources using an SSH public/private key pair.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn = js.native
}

object TeamMember {
  @scala.inline
  def apply(projectRole: Role, userArn: UserArn): TeamMember = {
    val __obj = js.Dynamic.literal(projectRole = projectRole.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMember]
  }
  @scala.inline
  implicit class TeamMemberOps[Self <: TeamMember] (val x: Self) extends AnyVal {
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
    def withUserArn(value: UserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(value.asInstanceOf[js.Any])
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
  }
  
}

