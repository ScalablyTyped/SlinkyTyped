package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConferenceProviderRequest extends js.Object {
  /**
    * The request token of the client.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The name of the conference provider.
    */
  var ConferenceProviderName: typingsSlinky.awsSdk.alexaforbusinessMod.ConferenceProviderName = js.native
  /**
    * Represents a type within a list of predefined types.
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

object CreateConferenceProviderRequest {
  @scala.inline
  def apply(
    ConferenceProviderName: ConferenceProviderName,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting
  ): CreateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderName = ConferenceProviderName.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConferenceProviderRequest]
  }
  @scala.inline
  implicit class CreateConferenceProviderRequestOps[Self <: CreateConferenceProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConferenceProviderName(value: ConferenceProviderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConferenceProviderName")(value.asInstanceOf[js.Any])
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
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
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

