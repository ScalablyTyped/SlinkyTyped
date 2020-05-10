package typingsSlinky.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFederationTokenResponse extends js.Object {
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typingsSlinky.awsSdk.stsMod.Credentials] = js.native
  /**
    * Identifiers for the federated user associated with the credentials (such as arn:aws:sts::123456789012:federated-user/Bob or 123456789012:Bob). You can use the federated user's ARN in your resource-based policies, such as an Amazon S3 bucket policy. 
    */
  var FederatedUser: js.UndefOr[typingsSlinky.awsSdk.stsMod.FederatedUser] = js.native
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
}

object GetFederationTokenResponse {
  @scala.inline
  def apply(): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
  @scala.inline
  implicit class GetFederationTokenResponseOps[Self <: GetFederationTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFederatedUser(value: FederatedUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FederatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFederatedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FederatedUser")(js.undefined)
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

