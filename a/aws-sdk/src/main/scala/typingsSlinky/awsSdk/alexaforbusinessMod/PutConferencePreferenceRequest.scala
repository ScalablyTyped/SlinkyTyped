package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConferencePreferenceRequest extends js.Object {
  /**
    * The conference preference of a specific conference provider.
    */
  var ConferencePreference: typingsSlinky.awsSdk.alexaforbusinessMod.ConferencePreference = js.native
}

object PutConferencePreferenceRequest {
  @scala.inline
  def apply(ConferencePreference: ConferencePreference): PutConferencePreferenceRequest = {
    val __obj = js.Dynamic.literal(ConferencePreference = ConferencePreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConferencePreferenceRequest]
  }
  @scala.inline
  implicit class PutConferencePreferenceRequestOps[Self <: PutConferencePreferenceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConferencePreference(value: ConferencePreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConferencePreference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

