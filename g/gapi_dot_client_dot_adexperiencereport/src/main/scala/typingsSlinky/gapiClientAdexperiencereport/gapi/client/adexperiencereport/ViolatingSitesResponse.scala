package typingsSlinky.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViolatingSitesResponse extends js.Object {
  /** A list of summaries of violating sites. */
  var violatingSites: js.UndefOr[js.Array[SiteSummaryResponse]] = js.native
}

object ViolatingSitesResponse {
  @scala.inline
  def apply(): ViolatingSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViolatingSitesResponse]
  }
  @scala.inline
  implicit class ViolatingSitesResponseOps[Self <: ViolatingSitesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViolatingSites(value: js.Array[SiteSummaryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violatingSites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolatingSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violatingSites")(js.undefined)
        ret
    }
  }
  
}

