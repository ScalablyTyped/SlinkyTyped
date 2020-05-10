package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1ListInspectFindingsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more results that match the
    * request; this value should be passed in a new `ListInspectFindingsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The results. */
  var result: js.UndefOr[GooglePrivacyDlpV2beta1InspectResult] = js.native
}

object GooglePrivacyDlpV2beta1ListInspectFindingsResponse {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1ListInspectFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ListInspectFindingsResponseOps[Self <: GooglePrivacyDlpV2beta1ListInspectFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: GooglePrivacyDlpV2beta1InspectResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

