package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingRequest extends js.Object {
  /**
    * The ARN of the analyzer that generated the finding.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * The ID of the finding to retrieve.
    */
  var id: FindingId = js.native
}

object GetFindingRequest {
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, id: FindingId): GetFindingRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingRequest]
  }
  @scala.inline
  implicit class GetFindingRequestOps[Self <: GetFindingRequest] (val x: Self) extends AnyVal {
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
    def withId(value: FindingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

