package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteCampaignRequest extends js.Object {
  /**
    * An array of requests that defines additional treatments for the campaign, in addition to the default treatment for the campaign.
    */
  var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.native
  /**
    * A custom description of the campaign.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
    */
  var HoldoutPercent: js.UndefOr[integer] = js.native
  /**
    * The settings for the AWS Lambda function to use as a code hook for the campaign.
    */
  var Hook: js.UndefOr[CampaignHook] = js.native
  /**
    * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value to false.
    */
  var IsPaused: js.UndefOr[boolean] = js.native
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageConfiguration] = js.native
  /**
    * A custom name for the campaign.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Schedule] = js.native
  /**
    * The unique identifier for the segment to associate with the campaign.
    */
  var SegmentId: js.UndefOr[string] = js.native
  /**
    * The version of the segment to associate with the campaign.
    */
  var SegmentVersion: js.UndefOr[integer] = js.native
  /**
    * The message template to use for the campaign.
    */
  var TemplateConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * A custom description of a variation of the campaign to use for A/B testing.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  /**
    * A custom name for a variation of the campaign to use for A/B testing.
    */
  var TreatmentName: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object WriteCampaignRequest {
  @scala.inline
  def apply(): WriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteCampaignRequest]
  }
  @scala.inline
  implicit class WriteCampaignRequestOps[Self <: WriteCampaignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalTreatments(value: ListOfWriteTreatmentResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalTreatments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalTreatments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalTreatments")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withHoldoutPercent(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoldoutPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoldoutPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withHook(value: CampaignHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hook")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPaused(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: CampaignLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageConfiguration(value: MessageConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: Schedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentVersion(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateConfiguration(value: TemplateConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatmentDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatmentDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatmentName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

