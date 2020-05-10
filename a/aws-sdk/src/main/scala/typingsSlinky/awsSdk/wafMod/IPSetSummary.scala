package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetSummary extends js.Object {
  /**
    * The IPSetId for an IPSet. You can use IPSetId in a GetIPSet request to get detailed information about an IPSet.
    */
  var IPSetId: ResourceId = js.native
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: ResourceName = js.native
}

object IPSetSummary {
  @scala.inline
  def apply(IPSetId: ResourceId, Name: ResourceName): IPSetSummary = {
    val __obj = js.Dynamic.literal(IPSetId = IPSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetSummary]
  }
  @scala.inline
  implicit class IPSetSummaryOps[Self <: IPSetSummary] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

