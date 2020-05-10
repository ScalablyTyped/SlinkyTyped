package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsStatisticsResponse extends js.Object {
  /**
    * Finding statistics object.
    */
  var FindingStatistics: typingsSlinky.awsSdk.guarddutyMod.FindingStatistics = js.native
}

object GetFindingsStatisticsResponse {
  @scala.inline
  def apply(FindingStatistics: FindingStatistics): GetFindingsStatisticsResponse = {
    val __obj = js.Dynamic.literal(FindingStatistics = FindingStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsResponse]
  }
  @scala.inline
  implicit class GetFindingsStatisticsResponseOps[Self <: GetFindingsStatisticsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindingStatistics(value: FindingStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingStatistics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

