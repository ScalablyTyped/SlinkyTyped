package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigRuleRequest extends js.Object {
  /**
    * The rule that you want to add to your account.
    */
  var ConfigRule: typingsSlinky.awsSdk.configserviceMod.ConfigRule = js.native
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}

object PutConfigRuleRequest {
  @scala.inline
  def apply(ConfigRule: ConfigRule): PutConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRule = ConfigRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigRuleRequest]
  }
  @scala.inline
  implicit class PutConfigRuleRequestOps[Self <: PutConfigRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRule(value: ConfigRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagsList): Self = {
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
  }
  
}

