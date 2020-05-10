package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
  /**
    * The type of the conference provider.
    */
  var ConferenceProviderType: typingsSlinky.awsSdk.alexaforbusinessMod.ConferenceProviderType = js.native
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.IPDialIn] = js.native
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typingsSlinky.awsSdk.alexaforbusinessMod.MeetingSetting = js.native
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.native
}

object UpdateConferenceProviderRequest {
  @scala.inline
  def apply(
    ConferenceProviderArn: Arn,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting
  ): UpdateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConferenceProviderRequest]
  }
  @scala.inline
  implicit class UpdateConferenceProviderRequestOps[Self <: UpdateConferenceProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConferenceProviderArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConferenceProviderArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConferenceProviderType(value: ConferenceProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConferenceProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeetingSetting(value: MeetingSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPDialIn(value: IPDialIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPDialIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPDialIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPDialIn")(js.undefined)
        ret
    }
    @scala.inline
    def withPSTNDialIn(value: PSTNDialIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PSTNDialIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPSTNDialIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PSTNDialIn")(js.undefined)
        ret
    }
  }
  
}

