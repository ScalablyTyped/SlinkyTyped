package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DailyVolume extends js.Object {
  /**
    * An object that contains inbox placement metrics for a specified day in the analysis period, broken out by the recipient's email provider.
    */
  var DomainIspPlacements: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.DomainIspPlacements] = js.native
  /**
    * The date that the DailyVolume metrics apply to, in Unix time.
    */
  var StartDate: js.UndefOr[js.Date] = js.native
  /**
    * An object that contains inbox placement metrics for a specific day in the analysis period.
    */
  var VolumeStatistics: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.VolumeStatistics] = js.native
}

object DailyVolume {
  @scala.inline
  def apply(): DailyVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyVolume]
  }
  @scala.inline
  implicit class DailyVolumeOps[Self <: DailyVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainIspPlacements(value: DomainIspPlacements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainIspPlacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainIspPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainIspPlacements")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeStatistics(value: VolumeStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatistics")(js.undefined)
        ret
    }
  }
  
}

