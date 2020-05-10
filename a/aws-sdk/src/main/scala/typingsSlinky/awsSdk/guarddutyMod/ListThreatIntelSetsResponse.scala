package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThreatIntelSetsResponse extends js.Object {
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the ThreatIntelSet resources.
    */
  var ThreatIntelSetIds: typingsSlinky.awsSdk.guarddutyMod.ThreatIntelSetIds = js.native
}

object ListThreatIntelSetsResponse {
  @scala.inline
  def apply(ThreatIntelSetIds: ThreatIntelSetIds): ListThreatIntelSetsResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetIds = ThreatIntelSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThreatIntelSetsResponse]
  }
  @scala.inline
  implicit class ListThreatIntelSetsResponseOps[Self <: ListThreatIntelSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreatIntelSetIds(value: ThreatIntelSetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

