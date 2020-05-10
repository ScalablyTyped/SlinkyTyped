package typingsSlinky.passportAzureAd.bearerStrategyMod

import typingsSlinky.passportAzureAd.commonMod.IBaseStrategyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBearerStrategyOption extends IBaseStrategyOption {
  var allowMultiAudiencesInToken: js.UndefOr[Boolean] = js.native
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  var policyName: js.UndefOr[String] = js.native
  var scope: js.UndefOr[js.Array[String]] = js.native
}

object IBearerStrategyOption {
  @scala.inline
  def apply(clientID: String, identityMetadata: String): IBearerStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBearerStrategyOption]
  }
  @scala.inline
  implicit class IBearerStrategyOptionOps[Self <: IBearerStrategyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultiAudiencesInToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiAudiencesInToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiAudiencesInToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiAudiencesInToken")(js.undefined)
        ret
    }
    @scala.inline
    def withAudience(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

