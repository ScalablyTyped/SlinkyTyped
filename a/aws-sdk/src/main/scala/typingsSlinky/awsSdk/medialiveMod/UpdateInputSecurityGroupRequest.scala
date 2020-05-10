package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputSecurityGroupRequest extends js.Object {
  /**
    * The id of the Input Security Group to update.
    */
  var InputSecurityGroupId: string = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRuleCidr] = js.native
}

object UpdateInputSecurityGroupRequest {
  @scala.inline
  def apply(InputSecurityGroupId: string): UpdateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputSecurityGroupRequest]
  }
  @scala.inline
  implicit class UpdateInputSecurityGroupRequestOps[Self <: UpdateInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputSecurityGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
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

