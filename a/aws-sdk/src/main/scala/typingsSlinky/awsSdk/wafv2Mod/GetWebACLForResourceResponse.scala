package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLForResourceResponse extends js.Object {
  /**
    * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web ACL.
    */
  var WebACL: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.WebACL] = js.native
}

object GetWebACLForResourceResponse {
  @scala.inline
  def apply(): GetWebACLForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLForResourceResponse]
  }
  @scala.inline
  implicit class GetWebACLForResourceResponseOps[Self <: GetWebACLForResourceResponse] (val x: Self) extends AnyVal {
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

