package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTeamMemberRequest extends js.Object {
  /**
    * A user- or system-generated token that identifies the entity that requested the team member association to the project. This token can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The ID of the project to which you will add the IAM user.
    */
  var projectId: ProjectId = js.native
  /**
    * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in an AWS CodeStar project.
    */
  var projectRole: Role = js.native
  /**
    * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources, for example Amazon EC2 instances.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  /**
    * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
    */
  var userArn: UserArn = js.native
}

object AssociateTeamMemberRequest {
  @scala.inline
  def apply(projectId: ProjectId, projectRole: Role, userArn: UserArn): AssociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], projectRole = projectRole.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTeamMemberRequest]
  }
  @scala.inline
  implicit class AssociateTeamMemberRequestOps[Self <: AssociateTeamMemberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: ProjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
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

