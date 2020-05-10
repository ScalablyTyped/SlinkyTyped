package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListScheduledAuditsResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of scheduled audits.
    */
  var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList] = js.native
}

object ListScheduledAuditsResponse {
  @scala.inline
  def apply(): ListScheduledAuditsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScheduledAuditsResponse]
  }
  @scala.inline
  implicit class ListScheduledAuditsResponseOps[Self <: ListScheduledAuditsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledAudits(value: ScheduledAuditMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAudits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledAudits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAudits")(js.undefined)
        ret
    }
  }
  
}

