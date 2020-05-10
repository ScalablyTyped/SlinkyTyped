package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLForResourceResponse extends js.Object {
  /**
    * Information about the web ACL that you specified in the GetWebACLForResource request. If there is no associated resource, a null WebACLSummary is returned.
    */
  var WebACLSummary: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.WebACLSummary] = js.native
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
    def withWebACLSummary(value: WebACLSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebACLSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLSummary")(js.undefined)
        ret
    }
  }
  
}

