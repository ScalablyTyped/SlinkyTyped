package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceProvider extends js.Object {
  /**
    * The ARN of the newly created conference provider.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Arn] = js.native
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.IPDialIn] = js.native
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MeetingSetting] = js.native
  /**
    * The name of the conference provider.
    */
  var Name: js.UndefOr[ConferenceProviderName] = js.native
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.native
  /**
    * The type of conference providers.
    */
  var Type: js.UndefOr[ConferenceProviderType] = js.native
}

object ConferenceProvider {
  @scala.inline
  def apply(): ConferenceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceProvider]
  }
  @scala.inline
  implicit class ConferenceProviderOps[Self <: ConferenceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withMeetingSetting(value: MeetingSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ConferenceProviderName): Self = {
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
    @scala.inline
    def withType(value: ConferenceProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

