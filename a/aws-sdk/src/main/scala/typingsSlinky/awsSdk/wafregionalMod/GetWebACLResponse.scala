package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLResponse extends js.Object {
  /**
    * Information about the WebACL that you specified in the GetWebACL request. For more information, see the following topics:    WebACL: Contains DefaultAction, MetricName, Name, an array of Rule objects, and WebACLId     DefaultAction (Data type is WafAction): Contains Type     Rules: Contains an array of ActivatedRule objects, which contain Action, Priority, and RuleId     Action: Contains Type   
    */
  var WebACL: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.WebACL] = js.native
}

object GetWebACLResponse {
  @scala.inline
  def apply(): GetWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLResponse]
  }
  @scala.inline
  implicit class GetWebACLResponseOps[Self <: GetWebACLResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebACL(value: WebACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebACL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACL")(js.undefined)
        ret
    }
  }
  
}

