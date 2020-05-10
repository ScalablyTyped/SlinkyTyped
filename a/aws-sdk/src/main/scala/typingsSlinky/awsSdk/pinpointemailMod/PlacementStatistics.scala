package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementStatistics extends js.Object {
  /**
    * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive inbox placement test.
    */
  var DkimPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement test.
    */
  var MissingPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox placement test.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive inbox placement test.
    */
  var SpfPercentage: js.UndefOr[Percentage] = js.native
}

object PlacementStatistics {
  @scala.inline
  def apply(): PlacementStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementStatistics]
  }
  @scala.inline
  implicit class PlacementStatisticsOps[Self <: PlacementStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDkimPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkimPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimPercentage")(js.undefined)
        ret
    }
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
    def withMissingPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingPercentage")(js.undefined)
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
    def withSpfPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpfPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpfPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpfPercentage")(js.undefined)
        ret
    }
  }
  
}

