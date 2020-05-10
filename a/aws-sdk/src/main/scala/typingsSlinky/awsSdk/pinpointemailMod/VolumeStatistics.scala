package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatistics extends js.Object {
  /**
    * The total number of emails that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.native
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
    */
  var ProjectedInbox: js.UndefOr[Volume] = js.native
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk mail folders.
    */
  var ProjectedSpam: js.UndefOr[Volume] = js.native
  /**
    * The total number of emails that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.native
}

object VolumeStatistics {
  @scala.inline
  def apply(): VolumeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatistics]
  }
  @scala.inline
  implicit class VolumeStatisticsOps[Self <: VolumeStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboxRawCount(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxRawCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboxRawCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxRawCount")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectedInbox(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectedInbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectedInbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectedInbox")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectedSpam(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectedSpam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectedSpam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectedSpam")(js.undefined)
        ret
    }
    @scala.inline
    def withSpamRawCount(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamRawCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpamRawCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamRawCount")(js.undefined)
        ret
    }
  }
  
}

