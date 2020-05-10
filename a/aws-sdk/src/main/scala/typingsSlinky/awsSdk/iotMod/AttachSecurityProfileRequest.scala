package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachSecurityProfileRequest extends js.Object {
  /**
    * The security profile that is attached.
    */
  var securityProfileName: SecurityProfileName = js.native
  /**
    * The ARN of the target (thing group) to which the security profile is attached.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn = js.native
}

object AttachSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName, securityProfileTargetArn: SecurityProfileTargetArn): AttachSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any], securityProfileTargetArn = securityProfileTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachSecurityProfileRequest]
  }
  @scala.inline
  implicit class AttachSecurityProfileRequestOps[Self <: AttachSecurityProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityProfileName(value: SecurityProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityProfileTargetArn(value: SecurityProfileTargetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileTargetArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

