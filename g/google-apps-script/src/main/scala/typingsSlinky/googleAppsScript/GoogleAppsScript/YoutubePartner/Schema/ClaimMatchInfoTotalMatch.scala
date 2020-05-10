package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimMatchInfoTotalMatch extends js.Object {
  var referenceDurationSecs: js.UndefOr[String] = js.native
  var userVideoDurationSecs: js.UndefOr[String] = js.native
}

object ClaimMatchInfoTotalMatch {
  @scala.inline
  def apply(): ClaimMatchInfoTotalMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimMatchInfoTotalMatch]
  }
  @scala.inline
  implicit class ClaimMatchInfoTotalMatchOps[Self <: ClaimMatchInfoTotalMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferenceDurationSecs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDurationSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDurationSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDurationSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVideoDurationSecs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVideoDurationSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVideoDurationSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVideoDurationSecs")(js.undefined)
        ret
    }
  }
  
}

