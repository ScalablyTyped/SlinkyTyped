package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainStatisticsReportResponse extends js.Object {
  /**
    * An object that contains deliverability metrics for the domain that you specified. This object contains data for each day, starting on the StartDate and ending on the EndDate.
    */
  var DailyVolumes: typingsSlinky.awsSdk.pinpointemailMod.DailyVolumes = js.native
  /**
    * An object that contains deliverability metrics for the domain that you specified. The data in this object is a summary of all of the data that was collected from the StartDate to the EndDate.
    */
  var OverallVolume: typingsSlinky.awsSdk.pinpointemailMod.OverallVolume = js.native
}

object GetDomainStatisticsReportResponse {
  @scala.inline
  def apply(DailyVolumes: DailyVolumes, OverallVolume: OverallVolume): GetDomainStatisticsReportResponse = {
    val __obj = js.Dynamic.literal(DailyVolumes = DailyVolumes.asInstanceOf[js.Any], OverallVolume = OverallVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainStatisticsReportResponse]
  }
  @scala.inline
  implicit class GetDomainStatisticsReportResponseOps[Self <: GetDomainStatisticsReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDailyVolumes(value: DailyVolumes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverallVolume(value: OverallVolume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverallVolume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

