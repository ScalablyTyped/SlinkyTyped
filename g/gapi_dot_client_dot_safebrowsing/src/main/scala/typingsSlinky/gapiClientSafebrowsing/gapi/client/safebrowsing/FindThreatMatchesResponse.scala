package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindThreatMatchesResponse extends js.Object {
  /** The threat list matches. */
  var matches: js.UndefOr[js.Array[ThreatMatch]] = js.native
}

object FindThreatMatchesResponse {
  @scala.inline
  def apply(): FindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindThreatMatchesResponse]
  }
  @scala.inline
  implicit class FindThreatMatchesResponseOps[Self <: FindThreatMatchesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: js.Array[ThreatMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
  }
  
}

