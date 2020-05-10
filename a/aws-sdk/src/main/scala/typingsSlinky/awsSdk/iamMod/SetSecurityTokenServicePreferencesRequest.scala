package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSecurityTokenServicePreferencesRequest extends js.Object {
  /**
    * The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see Activating and Deactivating STS in an AWS Region in the IAM User Guide.
    */
  var GlobalEndpointTokenVersion: globalEndpointTokenVersion = js.native
}

object SetSecurityTokenServicePreferencesRequest {
  @scala.inline
  def apply(GlobalEndpointTokenVersion: globalEndpointTokenVersion): SetSecurityTokenServicePreferencesRequest = {
    val __obj = js.Dynamic.literal(GlobalEndpointTokenVersion = GlobalEndpointTokenVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSecurityTokenServicePreferencesRequest]
  }
  @scala.inline
  implicit class SetSecurityTokenServicePreferencesRequestOps[Self <: SetSecurityTokenServicePreferencesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalEndpointTokenVersion(value: globalEndpointTokenVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalEndpointTokenVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

