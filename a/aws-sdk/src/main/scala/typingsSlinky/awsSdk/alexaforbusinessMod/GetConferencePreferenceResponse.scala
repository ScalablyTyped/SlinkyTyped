package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConferencePreferenceResponse extends js.Object {
  /**
    * The conference preference.
    */
  var Preference: js.UndefOr[ConferencePreference] = js.native
}

object GetConferencePreferenceResponse {
  @scala.inline
  def apply(): GetConferencePreferenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConferencePreferenceResponse]
  }
  @scala.inline
  implicit class GetConferencePreferenceResponseOps[Self <: GetConferencePreferenceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreference(value: ConferencePreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preference")(js.undefined)
        ret
    }
  }
  
}

