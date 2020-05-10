package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentMembershipRequest extends js.Object {
  /**
    * The ID of the environment for the environment member whose settings you want to change.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * The replacement type of environment member permissions you want to associate with this environment member. Available values include:    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: MemberPermissions = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
    */
  var userArn: UserArn = js.native
}

object UpdateEnvironmentMembershipRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId, permissions: MemberPermissions, userArn: UserArn): UpdateEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentMembershipRequest]
  }
  @scala.inline
  implicit class UpdateEnvironmentMembershipRequestOps[Self <: UpdateEnvironmentMembershipRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentId(value: EnvironmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: MemberPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserArn(value: UserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

