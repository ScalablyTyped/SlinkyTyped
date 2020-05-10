package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfUserProfile extends js.Object {
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.native
  /**
    * The user's name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
  /**
    * The user's SSH user name.
    */
  var SshUsername: js.UndefOr[String] = js.native
}

object SelfUserProfile {
  @scala.inline
  def apply(): SelfUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfUserProfile]
  }
  @scala.inline
  implicit class SelfUserProfileOps[Self <: SelfUserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamUserArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSshUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshUsername")(js.undefined)
        ret
    }
  }
  
}

