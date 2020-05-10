package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WafAction extends js.Object {
  /**
    * Specifies how you want AWS WAF to respond to requests that match the settings in a Rule. Valid settings include the following:    ALLOW - AWS WAF allows requests    BLOCK - AWS WAF blocks requests    COUNT - AWS WAF increments a counter of the requests that match all of the conditions in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify COUNT for the default action for a WebACL.  
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}

object WafAction {
  @scala.inline
  def apply(): WafAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafAction]
  }
  @scala.inline
  implicit class WafActionOps[Self <: WafAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

