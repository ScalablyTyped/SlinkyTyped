package typingsSlinky.awsSdkCredentialProviderIni.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeRoleParams extends js.Object {
  /**
    * A unique identifier that is used by third parties when assuming roles in
    * their customers' accounts.
    */
  var ExternalId: js.UndefOr[String] = js.native
  /**
    * The identifier of the role to be assumed.
    */
  var RoleArn: String = js.native
  /**
    * A name for the assumed role session.
    */
  var RoleSessionName: String = js.native
  /**
    * The identification number of the MFA device that is associated with the
    * user who is making the `AssumeRole` call.
    */
  var SerialNumber: js.UndefOr[String] = js.native
  /**
    * The value provided by the MFA device.
    */
  var TokenCode: js.UndefOr[String] = js.native
}

object AssumeRoleParams {
  @scala.inline
  def apply(RoleArn: String, RoleSessionName: String): AssumeRoleParams = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeRoleParams]
  }
  @scala.inline
  implicit class AssumeRoleParamsOps[Self <: AssumeRoleParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleSessionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleSessionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenCode")(js.undefined)
        ret
    }
  }
  
}

