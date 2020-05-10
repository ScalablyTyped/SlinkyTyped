package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIPSetRequest extends js.Object {
  /**
    * The IPSetId of the IPSet that you want to get. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId = js.native
}

object GetIPSetRequest {
  @scala.inline
  def apply(IPSetId: ResourceId): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(IPSetId = IPSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetRequest]
  }
  @scala.inline
  implicit class GetIPSetRequestOps[Self <: GetIPSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

