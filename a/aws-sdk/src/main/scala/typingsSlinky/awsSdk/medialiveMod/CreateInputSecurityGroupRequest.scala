package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputSecurityGroupRequest extends js.Object {
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRuleCidr] = js.native
}

object CreateInputSecurityGroupRequest {
  @scala.inline
  def apply(): CreateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputSecurityGroupRequest]
  }
  @scala.inline
  implicit class CreateInputSecurityGroupRequestOps[Self <: CreateInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistRules(value: listOfInputWhitelistRuleCidr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitelistRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitelistRules")(js.undefined)
        ret
    }
  }
  
}

