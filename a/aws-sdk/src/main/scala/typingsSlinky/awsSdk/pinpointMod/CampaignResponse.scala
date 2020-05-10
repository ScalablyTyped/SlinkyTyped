package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignResponse extends js.Object {
  /**
    * An array of responses, one for each treatment that you defined for the campaign, in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.native
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: string = js.native
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var Arn: string = js.native
  /**
    * The date, in ISO 8601 format, when the campaign was created.
    */
  var CreationDate: string = js.native
  /**
    * The current status of the campaign's default treatment. This value exists only for campaigns that have more than one treatment, to support A/B testing.
    */
  var DefaultState: js.UndefOr[CampaignState] = js.native
  /**
    * The custom description of the campaign.
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
    * The unique identifier for the campaign.
    */
  var Id: string = js.native
  /**
    * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this value to false.
    */
  var IsPaused: js.UndefOr[boolean] = js.native
  /**
    * The date, in ISO 8601 format, when the campaign was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageConfiguration] = js.native
  /**
    * The name of the campaign.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Schedule] = js.native
  /**
    * The unique identifier for the segment that's associated with the campaign.
    */
  var SegmentId: string = js.native
  /**
    * The version number of the segment that's associated with the campaign.
    */
  var SegmentVersion: integer = js.native
  /**
    * The current status of the campaign.
    */
  var State: js.UndefOr[CampaignState] = js.native
  /**
    * The message template that’s used for the campaign.
    */
  var TemplateConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * The custom description of a variation of the campaign that's used for A/B testing.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  /**
    * The custom name of a variation of the campaign that's used for A/B testing.
    */
  var TreatmentName: js.UndefOr[string] = js.native
  /**
    * The version number of the campaign.
    */
  var Version: js.UndefOr[integer] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object CampaignResponse {
  @scala.inline
  def apply(
    ApplicationId: string,
    Arn: string,
    CreationDate: string,
    Id: string,
    LastModifiedDate: string,
    SegmentId: string,
    SegmentVersion: integer
  ): CampaignResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], SegmentVersion = SegmentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignResponse]
  }
  @scala.inline
  implicit class CampaignResponseOps[Self <: CampaignResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegmentId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegmentVersion(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalTreatments(value: ListOfTreatmentResource): Self = {
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
    def withDefaultState(value: CampaignState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultState")(js.undefined)
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
    def withState(value: CampaignState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
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
    def withVersion(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
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

