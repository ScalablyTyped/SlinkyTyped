package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentMember extends js.Object {
  /**
    * The ID of the environment for the environment member.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.native
  /**
    * The time, expressed in epoch time format, when the environment member last opened the environment.
    */
  var lastAccess: js.UndefOr[js.Date] = js.native
  /**
    * The type of environment member permissions associated with this environment member. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: js.UndefOr[Permissions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment member.
    */
  var userArn: js.UndefOr[UserArn] = js.native
  /**
    * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
    */
  var userId: js.UndefOr[String] = js.native
}

object EnvironmentMember {
  @scala.inline
  def apply(): EnvironmentMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentMember]
  }
  @scala.inline
  implicit class EnvironmentMemberOps[Self <: EnvironmentMember] (val x: Self) extends AnyVal {
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
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccess(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: Permissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
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
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

