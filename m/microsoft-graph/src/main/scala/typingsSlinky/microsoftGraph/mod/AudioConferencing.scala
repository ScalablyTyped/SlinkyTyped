package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioConferencing extends js.Object {
  var conferenceId: js.UndefOr[String] = js.native
  var dialinUrl: js.UndefOr[String] = js.native
  var tollFreeNumber: js.UndefOr[String] = js.native
  var tollNumber: js.UndefOr[String] = js.native
}

object AudioConferencing {
  @scala.inline
  def apply(): AudioConferencing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConferencing]
  }
  @scala.inline
  implicit class AudioConferencingOps[Self <: AudioConferencing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDialinUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialinUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialinUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialinUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTollFreeNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tollFreeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTollFreeNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tollFreeNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTollNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tollNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTollNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tollNumber")(js.undefined)
        ret
    }
  }
  
}

