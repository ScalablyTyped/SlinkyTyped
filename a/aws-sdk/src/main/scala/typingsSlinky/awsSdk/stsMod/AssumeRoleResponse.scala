package typingsSlinky.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeRoleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you can use to refer to the resulting temporary security credentials. For example, you can reference these credentials as a principal in a resource-based policy by using the ARN or assumed role ID. The ARN and ID include the RoleSessionName that you specified when you called AssumeRole. 
    */
  var AssumedRoleUser: js.UndefOr[typingsSlinky.awsSdk.stsMod.AssumedRoleUser] = js.native
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typingsSlinky.awsSdk.stsMod.Credentials] = js.native
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
}

object AssumeRoleResponse {
  @scala.inline
  def apply(): AssumeRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleResponse]
  }
  @scala.inline
  implicit class AssumeRoleResponseOps[Self <: AssumeRoleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumedRoleUser(value: AssumedRoleUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumedRoleUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumedRoleUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumedRoleUser")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withPackedPolicySize(value: nonNegativeIntegerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackedPolicySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackedPolicySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackedPolicySize")(js.undefined)
        ret
    }
  }
  
}

