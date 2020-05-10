package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIspPlacement extends js.Object {
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.native
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.IspName] = js.native
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.native
}

object DomainIspPlacement {
  @scala.inline
  def apply(): DomainIspPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainIspPlacement]
  }
  @scala.inline
  implicit class DomainIspPlacementOps[Self <: DomainIspPlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboxPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboxPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxPercentage")(js.undefined)
        ret
    }
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
    def withIspName(value: IspName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IspName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIspName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IspName")(js.undefined)
        ret
    }
    @scala.inline
    def withSpamPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpamPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamPercentage")(js.undefined)
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

