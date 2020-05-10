package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimMatchInfoLongestMatch extends js.Object {
  var durationSecs: js.UndefOr[String] = js.native
  var referenceOffset: js.UndefOr[String] = js.native
  var userVideoOffset: js.UndefOr[String] = js.native
}

object ClaimMatchInfoLongestMatch {
  @scala.inline
  def apply(): ClaimMatchInfoLongestMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimMatchInfoLongestMatch]
  }
  @scala.inline
  implicit class ClaimMatchInfoLongestMatchOps[Self <: ClaimMatchInfoLongestMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationSecs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVideoOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVideoOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVideoOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVideoOffset")(js.undefined)
        ret
    }
  }
  
}

