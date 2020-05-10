package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsRequest extends js.Object {
  /**
    * The ARN of the analyzer that generated the findings to update.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the findings to update.
    */
  var ids: js.UndefOr[FindingIdList] = js.native
  /**
    * The ARN of the resource identified in the finding.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The state represents the action to take to update the finding Status. Use ARCHIVE to change an Active finding to an Archived finding. Use ACTIVE to change an Archived finding to an Active finding.
    */
  var status: FindingStatusUpdate = js.native
}

object UpdateFindingsRequest {
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, status: FindingStatusUpdate): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
  @scala.inline
  implicit class UpdateFindingsRequestOps[Self <: UpdateFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzerArn(value: AnalyzerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: FindingStatusUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: FindingIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(js.undefined)
        ret
    }
  }
  
}

