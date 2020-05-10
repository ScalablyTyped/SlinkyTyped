package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimMatchInfo extends js.Object {
  var longestMatch: js.UndefOr[ClaimMatchInfoLongestMatch] = js.native
  var matchSegments: js.UndefOr[js.Array[MatchSegment]] = js.native
  var referenceId: js.UndefOr[String] = js.native
  var totalMatch: js.UndefOr[ClaimMatchInfoTotalMatch] = js.native
}

object ClaimMatchInfo {
  @scala.inline
  def apply(): ClaimMatchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimMatchInfo]
  }
  @scala.inline
  implicit class ClaimMatchInfoOps[Self <: ClaimMatchInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLongestMatch(value: ClaimMatchInfoLongestMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longestMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongestMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longestMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchSegments(value: js.Array[MatchSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalMatch(value: ClaimMatchInfoTotalMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMatch")(js.undefined)
        ret
    }
  }
  
}

