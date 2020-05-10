package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverallVolume extends js.Object {
  /**
    * An object that contains inbox and junk mail placement metrics for individual email providers.
    */
  var DomainIspPlacements: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.DomainIspPlacements] = js.native
  /**
    * The percentage of emails that were sent from the domain that were read by their recipients.
    */
  var ReadRatePercent: js.UndefOr[Percentage] = js.native
  /**
    * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk mail folders.
    */
  var VolumeStatistics: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.VolumeStatistics] = js.native
}

object OverallVolume {
  @scala.inline
  def apply(): OverallVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverallVolume]
  }
  @scala.inline
  implicit class OverallVolumeOps[Self <: OverallVolume] (val x: Self) extends AnyVal {
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
    def withReadRatePercent(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadRatePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadRatePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadRatePercent")(js.undefined)
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

