package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Campaign extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign. 
    */
  var campaignArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix format) that the campaign was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * If a campaign fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The date and time (in Unix format) that the campaign was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  var latestCampaignUpdate: js.UndefOr[CampaignUpdateSummary] = js.native
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of a specific version of the solution.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the campaign. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object Campaign {
  @scala.inline
  def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  @scala.inline
  implicit class CampaignOps[Self <: Campaign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestCampaignUpdate(value: CampaignUpdateSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestCampaignUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestCampaignUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestCampaignUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProvisionedTPS(value: TransactionsPerSecond): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProvisionedTPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProvisionedTPS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProvisionedTPS")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionVersionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

